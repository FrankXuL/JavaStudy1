package JavaEE.udpEcho;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @title: UdpEchoClient
 * @Author Xu
 * @Date: 2022/8/21 18:01
 * @Version 1.0
 */
@SuppressWarnings("all")
public class UdpEchoClient {
    private DatagramSocket socket = null;
    private String serverIp;
    private int port;

    public UdpEchoClient(String serverIp, int port) throws SocketException {
        this.serverIp = serverIp;
        this.port = port;
        socket = new DatagramSocket();
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //1.读取数据
            System.out.print("->");
            String request = scanner.nextLine();
            if (request.equals("exit")) {
                System.out.println("客户端退出");
                return;
            }
            //2.构造请求发送服务器
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(),
                    request.getBytes().length, InetAddress.getByName(serverIp), port);
            socket.send(requestPacket);
            //3.尝试从服务器读取响应
            DatagramPacket responsePacket = new DatagramPacket(new byte[4096], 4096);
            socket.receive(responsePacket);
            String response = new String(responsePacket.getData(), 0, responsePacket.getLength());
            //4.显示响应结果
            String log = String.format("req：%s; resp:%s", request, response);
            System.out.println(log);
        }
    }

    public static void main(String[] args) throws IOException {
        UdpEchoClient udpEchoClient = new UdpEchoClient("127.0.0.1", 9090);
        udpEchoClient.start();
    }
}