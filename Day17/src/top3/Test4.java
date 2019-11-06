package top3;

import java.io.File;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹路径");
        String str = sc.nextLine();
        File file = new File(str);
        System.out.println("该文件下包含");
        printDirectory(file);
    }//E:\Maven\apache-maven-3.6.2\conf
    private static void printDirectory(File file) {
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()){
                System.out.println("文件-------" + files[i].getName());
            } else if (files[i].isDirectory()) {
                System.out.println("文件夹-------" + files[i].getName() + "👇");
                printDirectory(files[i]);
            }
        }
    }
}
