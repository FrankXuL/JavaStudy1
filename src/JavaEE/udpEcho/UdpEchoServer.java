package JavaEE.udpEcho;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @title: UdpEchoServer
 * @Author Xu
 * @Date: 2022/8/21 17:47
 * @Version 1.0
 */
@SuppressWarnings("all")
public class UdpEchoServer {
    private DatagramSocket socket = null;

    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动！");
        while (true) {
            //1.读取请求并解析
            DatagramPacket requestPacket = new DatagramPacket(new byte[4096], 4096);
            socket.receive(requestPacket);
            //2.根据请求计算响应
            String request = new String(requestPacket.getData(), 0, requestPacket.getLength());
            String response = process(request);
            //3.把响应回写到客户端
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(),
                    response.getBytes().length, requestPacket.getSocketAddress());
            socket.send(responsePacket);
            //4.打印日志
            String log = String.format("[%s:%d] req:%s; resp:%s",
                    requestPacket.getAddress().toString(), requestPacket.getPort(),
                    request, response);
            System.out.println(log);
        }
    }

    public String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        UdpEchoServer udpEchoServer = new UdpEchoServer(9090);
        udpEchoServer.start();
    }
}