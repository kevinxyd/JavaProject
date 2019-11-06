package top3;

import java.io.File;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        File file = new File(str);
        printDetroy(file);
    }

    private static void printDetroy(File file) {
        File[] files = file.listFiles();
        for (File file1:files) {
            if (file1.isFile()){
                file1.delete();
            } else {
                printDetroy(file1);
                file1.delete();
            }
        }
    }
}
