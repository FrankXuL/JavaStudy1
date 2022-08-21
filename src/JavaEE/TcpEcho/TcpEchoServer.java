package JavaEE.TcpEcho;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @title: TcpEchoServer
 * @Author Xu
 * @Date: 2022/8/21 18:21
 * @Version 1.0
 */
@SuppressWarnings("all")
public class TcpEchoServer {
    private ServerSocket listenSocket = null;

    public TcpEchoServer(int port) throws IOException {
        listenSocket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动");
        while (true) {
            Socket clientSocket = listenSocket.accept();
            processConnection(clientSocket);
        }
    }

    private void processConnection(Socket clientSocket) throws IOException {
        String log = String.format("[%s:%d]客户端已上线",
                clientSocket.getInetAddress().toString(), clientSocket.getPort());
        System.out.println(log);
        try (InputStream inputStream = clientSocket.getInputStream();
             OutputStream outputStream = clientSocket.getOutputStream()) {
            while (true) {
                //1.读取请求并解析
                Scanner scanner = new Scanner(inputStream);
                if (!scanner.hasNext()) {
                    log = String.format("[%s:%d]客户端已下线",
                            clientSocket.getInetAddress().toString(), clientSocket.getPort());
                    System.out.println(log);
                    return;
                }
                String request = scanner.next();
                //2.根据请求计算响应
                String response = process(request);
                //3.把响应写回给客户端
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println(response);
                printWriter.flush();
                //4.打印日志
                log = String.format("[%s:%d] req:%s; resp:%s",
                        clientSocket.getInetAddress().toString(), clientSocket.getPort(),
                        request, response);
                System.out.println(log);

            }
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
        TcpEchoServer tcpEchoServer = new TcpEchoServer(9090);
        tcpEchoServer.start();
    }
}