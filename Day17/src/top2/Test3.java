package top2;

import java.io.File;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        File file = new File(str);
        printDetory(file);
    }

    private static void printDetory(File file) {
        File[] files = file.listFiles();
        for (File file1:files) {
            if (file1.isFile()){
                System.out.println(file1.getAbsolutePath());
            } else {
                System.out.println("目录" + file1.getAbsolutePath());
                printDetory(file1);
            }
        }
    }
}
