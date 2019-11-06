package test3;

import java.io.IOException;
import java.net.*;

public class PersonTest {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8989);
        String str = "Hello World";

        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(),InetAddress.getByName("localhost"),8001);
        ds.send(dp);
        ds.close();

    }
}
