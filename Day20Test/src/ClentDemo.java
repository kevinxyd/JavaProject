import java.io.*;
import java.net.Socket;

public class ClentDemo {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 5; i++) {
            Socket socket = new Socket("127.0.0.1", 6666);
            OutputStream outputStream = socket.getOutputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("b.jpg"));
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }
            outputStream.close();
            bufferedInputStream.close();
            socket.close();
        }
    }
    /*Socket socket = new Socket("192.168.0.120", 6666);
    //客户端发送数据写数据
    OutputStream outputStream = socket.getOutputStream();
        outputStream.write("客户端：你好我叫客户端，你是服务端吗".getBytes());

    //客户端ip地址
    String address = socket.getInetAddress().getHostAddress();
    //客户端端口号
    int port = socket.getPort();
        System.out.println("服务端地址端口号" + address + ":" + port);
    InputStream inputStream = socket.getInputStream();
    int len;
    byte[] bytes = new byte[1024];
    len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
    //关闭资源及通讯

        outputStream.close();*/
}
