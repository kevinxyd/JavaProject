package test9;

import java.io.*;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8989);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(System.currentTimeMillis()+".jpg"));
        outputStream.write("请求图片".getBytes());
        int len;
        byte[] bytes = new byte[1024];
        while (-1!=(len=inputStream.read(bytes))){
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedOutputStream.close();
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
