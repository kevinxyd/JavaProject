package test6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            Socket socket = new Socket("127.0.0.1", 8989);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            System.out.println("向服务器发送消息：(exit结束)");
            String str = scanner.next();
            if (str.equals("exit")){
                break;
            } else {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            System.out.println("服务器回复您" + bufferedReader.readLine());
            bufferedReader.close();
            bufferedWriter.close();
            socket.close();
        }

    }
}
