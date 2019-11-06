package top2;

import java.io.*;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算的字母或数字");
        char c = scanner.next().charAt(0);
        System.out.println("该字符共出现" + printDirectoryNumber(c) + "次");
    }

    private static int printDirectoryNumber(Character c) throws IOException {
        File file = new File("e://a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int number = 0;
        int len;
        while ((len = fileInputStream.read()) != -1){
            if (c.equals((char)len)){
                number ++;
            }
        }
        return number;
    }
}
