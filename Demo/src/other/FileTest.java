package other;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("e://work//JavaProject//Demo//src//BaoZi.java");
        File file2 = new File("other/BaoZi.java");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
    }


}
