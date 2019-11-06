package test8;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
            Socket socket = new Socket("192.168.0.121", 7777);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            System.out.println("输入账号：");
            String str = scanner.next();
            System.out.println("请输入密码：");
            String pwd = scanner.next();
            bufferedWriter.write(str + " = " + pwd);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
            bufferedWriter.close();
            socket.close();
    }
}
