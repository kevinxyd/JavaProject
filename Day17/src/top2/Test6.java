package top2;

import java.io.File;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        File file = new File(str);
        System.out.println("文件大小" + calculate(file));
    }

    private static long calculate(File file) {
        File[] files = file.listFiles();
        long size = 0;
        for (File file1:files) {
            if (file1.isFile()){
                size += file1.length();
            } else {
                size += calculate(file1);
            }
        }
        return size;
    }
}
