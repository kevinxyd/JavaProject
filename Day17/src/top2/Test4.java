package top2;

import top2.serviceImpl.Filter;

import java.io.File;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        File file = new File(str);
        Filter filter = new Filter();
        System.out.println(filter.accept(file));
        if (filter.accept(file)) {
            File[] files = file.listFiles();
            for (File file1:files){
                System.out.println(file1.getAbsolutePath());
            }
        }
    }
}
