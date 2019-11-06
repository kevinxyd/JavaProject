package top1;

import java.io.File;

public class Test8 {
    public static void main(String[] args) {
        File file = new File("c://test");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }
}
