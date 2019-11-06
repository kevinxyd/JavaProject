package test6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8989);
        while (true){
            Socket socket = serverSocket.accept();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String s = bufferedReader.readLine();
            System.out.println("客户端发送请求" + s);
            bufferedWriter.write("你好");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}
