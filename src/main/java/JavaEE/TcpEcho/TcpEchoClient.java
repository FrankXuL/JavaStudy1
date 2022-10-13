package JavaEE.TcpEcho;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @title: TcpEchoClient
 * @Author Xu
 * @Date: 2022/8/21 18:36
 * @Version 1.0
 */
@SuppressWarnings("all")
public class TcpEchoClient {
    private Socket socket;
    private String serverIp;
    private int serverPort;

    public TcpEchoClient(String serverIp, int serverPort) throws IOException {
        this.serverIp = serverIp;
        this.serverPort = serverPort;
        this.socket = new Socket(serverIp, serverPort);
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (InputStream inputStream = socket.getInputStream();
             OutputStream outputStream = socket.getOutputStream()) {
            System.out.println("客户端上线！");
            while (true) {
                //1.从键盘上读取内容
                System.out.print("->");
                String request = scanner.next();
                //2.构造请求并发送给服务器
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println(request);
                printWriter.flush();
                //3.从服务器读取响应
                Scanner respScanner = new Scanner(inputStream);
                String response = respScanner.next();
                //4.打印响应结果
                String log = String.format("req:%s;resp:%s", request, response);
                System.out.println(log);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }
    }

    public static void main(String[] args) throws IOException {
        TcpEchoClient tcpEchoClient = new TcpEchoClient("127.0.0.1", 9090);
        tcpEchoClient.start();
    }
}