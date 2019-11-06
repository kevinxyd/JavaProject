package test4;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        int len;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

    }
}
