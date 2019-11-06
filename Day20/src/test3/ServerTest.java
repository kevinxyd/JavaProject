package test3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[1024];

        DatagramSocket ds = new DatagramSocket(8001);//定义一个datagramsocket对象，监听的端口8001

        DatagramPacket dp = new DatagramPacket(bytes, 1024);//用于接收数据
        ds.receive(dp);
        String str = new String(dp.getData(), 0, dp.getLength())+"from"+dp.getAddress().getHostAddress()+":"+dp.getPort();

        System.out.println(str);
        ds.close();
    }
}
