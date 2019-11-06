package test9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8989);
        while (true){
            Socket socket = serverSocket.accept();
            OutputStream outputStream = socket.getOutputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("a.jpg"));
            int len;
            byte[] bytes = new byte[1024];
            while (-1 != (len = bufferedInputStream.read(bytes))) {
                outputStream.write(bytes, 0, len);
            }
            bufferedInputStream.close();
            outputStream.close();
            socket.close();

        }
    }
}
