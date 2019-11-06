import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8989);
        new Thread(() -> {
            Socket socket;
            InputStream inputStream;
            BufferedOutputStream bufferedOutputStream;
            try {
                socket = serverSocket.accept();
                inputStream = socket.getInputStream();
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(System.currentTimeMillis() + ".jpg"));
                int len;
                byte[] bytes = new byte[1024];
                while ((len = inputStream.read(bytes)) != -1) {
                    bufferedOutputStream.write(bytes, 0, len);
                }
                bufferedOutputStream.close();
                inputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

    }

    //先创建服务端，端口号指定6666
   /* ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("1");
    //监听服务端客户端连接，有的话返回
    Socket accept = serverSocket.accept();
    //客户端ip地址
    String address = accept.getInetAddress().getHostAddress();
    //客户端端口号
    int port = accept.getPort();
        System.out.println("客户端地址端口号" + address + ":" + port);
    InputStream inputStream = accept.getInputStream();
    OutputStream outputStream = accept.getOutputStream();
        outputStream.write("服务端：你好我是服务端".getBytes());
    int len;
    byte[] bytes = new byte[1024];
    len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));

        inputStream.close();*/
}
