package JavaEE.TcpEcho;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @title: TcpThreadPoolEcho
 * @Author Xu
 * @Date: 2022/8/21 19:22
 * @Version 1.0
 *
 */
@SuppressWarnings("all")
public class TcpThreadPoolEchoServer {
    private ServerSocket listenSocket = null;

    public TcpThreadPoolEchoServer(int port) throws IOException {
        listenSocket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动!");
        ExecutorService executorService = Executors.newCachedThreadPool();
        while (true) {
            Socket clientSocket = listenSocket.accept();
            // 使用线程池来处理当前的 processConnection
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        processConnection(clientSocket);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void processConnection(Socket clientSocket) throws IOException {
        String log = String.format("[%s:%d] 客户端上线!", clientSocket.getInetAddress().toString(),
                clientSocket.getPort());
        System.out.println(log);
        try (InputStream inputStream = clientSocket.getInputStream();
             OutputStream outputStream = clientSocket.getOutputStream()) {
            while (true) {
                // 1. 读取请求并解析
                Scanner scanner = new Scanner(inputStream);
                if (!scanner.hasNext()) {
                    log = String.format("[%s:%d] 客户端下线!", clientSocket.getInetAddress().toString(),
                            clientSocket.getPort());
                    System.out.println(log);
                    break;
                }
                String request = scanner.next();
                // 2. 根据请求计算响应
                String response = process(request);
                // 3. 把响应写回到客户端
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println(response);
                printWriter.flush();
                //4. 打印日志
                log = String.format("[%s:%d] req: %s; resp: %s", clientSocket.getInetAddress().toString(),
                        clientSocket.getPort(), request, response);
                System.out.println(log);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            clientSocket.close();
        }
    }

    // 回显服务器, 直接把请求返回即可
    public String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        TcpThreadPoolEchoServer tcpThreadPoolEchoServer = new TcpThreadPoolEchoServer(9090);
        tcpThreadPoolEchoServer.start();
    }
}