package top2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("e://a");
        FileOutputStream fileOutputStream = new FileOutputStream("e://a.txt");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请录入内容（结束请按end）");
            String str = scanner.next();
            fileOutputStream.write(str.getBytes());
            fileOutputStream.write("\r\n".getBytes());
            if (str.equals("end")){
                break;
            }
        }
        fileOutputStream.close();
    }
}
