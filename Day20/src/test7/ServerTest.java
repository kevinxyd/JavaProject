package test7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8989);
        while (true){
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(System.currentTimeMillis() + ".jpg"));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write("图片上传成功");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            int len;
            byte[] bytes = new byte[1024];
            while ((len = inputStream.read(bytes)) != -1){
                bufferedOutputStream.write(bytes,0,len);
            }
            bufferedWriter.close();
            bufferedOutputStream.close();
            inputStream.close();
            socket.close();
        }
    }
}
