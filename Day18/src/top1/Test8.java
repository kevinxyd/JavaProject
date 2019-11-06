package top1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("e://info.txt");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请录入内容（结束请按886）");
            String str = scanner.next();
            if (str.equals("886")){
                break;
            }
            fileWriter.write(str);
            fileWriter.write("\r\n");
            fileWriter.flush();
        }
        fileWriter.close();
    }
}
