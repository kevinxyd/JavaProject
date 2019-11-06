package test8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Set;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8989);
        while (true){
            Socket socket = serverSocket.accept();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String coupwd = bufferedReader.readLine();
            String[] split = coupwd.split(" = ");
            String name = split[0];
            String pwd = split[1];
            System.out.println(name + pwd);
            Properties properties = new Properties();
            properties.load(new FileInputStream("a.txt"));
            Set<String> strings = properties.stringPropertyNames();
            for (String s:strings) {
                if (s.equals(name) && properties.getProperty(s).equals(pwd)){
                    System.out.println("  " + s + properties.getProperty(s));
                    bufferedWriter.write("输入正确");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                } else {
                    System.out.println(s + properties.getProperty(s));
                    properties.setProperty(name,pwd);
                    bufferedWriter.write("输入不正确，已注册");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
            for (String str:strings) {
                fileOutputStream.write((str + "=" + properties.getProperty(str)+ "\n").getBytes());
            }
            fileOutputStream.close();
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}
