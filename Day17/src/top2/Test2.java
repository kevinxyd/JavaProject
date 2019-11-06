package top2;

import java.io.File;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件地址");
        String str = scanner.next();
        File file = new File(str);
        if (file.isDirectory()){
            System.out.println("是文件夹");
            int sum = 0;
            File[] files = file.listFiles();
            for (File file1:files) {
                sum += file1.length();
            }
            System.out.println("总大小为：" + sum);
        } else {
            System.out.println("是文件" + file.length());
        }
    }
}
