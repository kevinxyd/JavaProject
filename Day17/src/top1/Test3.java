package top1;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File file = new File(new File("").getAbsolutePath());
        file.mkdir();
        System.out.println("已创建");
    }
}
