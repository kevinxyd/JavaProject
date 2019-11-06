import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8989);
        Socket socket = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String s = bufferedReader.readLine();
        String[] split = s.split(" ");
        String path = split[1].substring(1);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path));
        OutputStream outputStream = socket.getOutputStream();

        //谷歌浏览器
        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
        outputStream.write("Content‐Type:text/html\r\n".getBytes());
        outputStream.write("\r\n".getBytes());

        int len;
        byte[] bytes = new byte[1024];
        while ((len = bufferedInputStream.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
        }
        outputStream.close();
        bufferedInputStream.close();
        bufferedReader.close();
        socket.close();
    }
}
