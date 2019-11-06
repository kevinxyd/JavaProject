package top1;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File(new File("").getAbsolutePath());
        if (file.exists()){
            System.out.println("文件已存在");
        } else {
            file.createNewFile();
            System.out.println("该文件不存在，已创建");
        }

    }
}
