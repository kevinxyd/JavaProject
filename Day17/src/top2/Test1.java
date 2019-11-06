package top2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件地址");
        String str = scanner.next();
        File file = new File(str);
        if (file.isFile()){
            System.out.println("已存在，文件大小" + file.length());
        } else {
            file.createNewFile();
            System.out.println("文件已创建");
        }
    }
}
