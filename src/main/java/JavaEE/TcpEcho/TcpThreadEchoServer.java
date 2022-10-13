package JavaEE.TcpEcho;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @title: TcpThreadEchoServer
 * @Author Xu
 * @Date: 2022/8/21 19:03
 * @Version 1.0
 */
@SuppressWarnings("all")
public class TcpThreadEchoServer {
    private ServerSocket listenSocket;

    public TcpThreadEchoServer(int port) throws IOException {
        listenSocket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动");
        while (true) {
            Socket clientSocket = listenSocket.accept();
            // 创建一个线程来给这个客户端提供服务
            Thread t = new Thread() {
                @Override
                public void run() {
                    try {
                        processConnection(clientSocket);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            t.start();
        }
    }

    private void processConnection(Socket clientSocket) throws IOException {
        String log = String.format("[%s:%d]客户端已上线",
                clientSocket.getInetAddress().toString(), clientSocket.getPort());
        System.out.println(log);
        try (InputStream inputStream = clientSocket.getInputStream();
             OutputStream outputStream = clientSocket.getOutputStream()) {
            //1.读取请求并解析
            Scanner scanner = new Scanner(inputStream);
            String request = scanner.next();
            //2.根据请求计算响应
            String response = process(request);
            //3.把响应发回给客户端
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println(response);
            printWriter.flush();
            //4.打印日志
            log = String.format("[%s:%d] req:%s; resp:%s",
                    clientSocket.getInetAddress().toString(), clientSocket.getPort(),
                    request, response);
            System.out.println(log);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            clientSocket.close();
        }
    }

    private String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        TcpThreadEchoServer tcpThreadEchoServer = new TcpThreadEchoServer(9090);
        tcpThreadEchoServer.start();
    }
}