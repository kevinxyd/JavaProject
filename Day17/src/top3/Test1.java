package top3;

import java.io.File;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        File file = new File(str);
        printDetroy(file);
    }

    private static void printDetroy(File file) {
        File[] files = file.listFiles(pathname -> pathname.length() < 200 * 1024 || pathname.isDirectory());
        for (File file1:files) {
            if (file1.isFile()){
                System.out.println("文件名：" + file1.getAbsolutePath());
            } else {
              printDetroy(file1);
            }
        }
    }
}
