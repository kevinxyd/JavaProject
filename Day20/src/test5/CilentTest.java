package test5;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class CilentTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("我是客户端2".getBytes());
        outputStream.close();
        socket.close();
    }
}
