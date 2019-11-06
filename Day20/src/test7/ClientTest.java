package test7;

import java.io.*;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8989);
        OutputStream outputStream = socket.getOutputStream();
        File file = new File("a.jpg");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int len;
        byte[] bytes = new byte[1024];
        System.out.println("正在上传");
        while ((len = bufferedInputStream.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
        }
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
        bufferedInputStream.close();
        outputStream.close();
        socket.close();

    }
}
