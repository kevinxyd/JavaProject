package top1;

import java.io.File;

public class Test7 {
    public static void main(String[] args) {
        File file = new File(new File("").getAbsolutePath());
        if (file.isFile()){
            System.out.println(file.getName() + "是文件");
        } else {
            System.out.println(file.getName() + "不是文件");
        }
        if (file.isDirectory()){
            System.out.println(file.getName() + "是文件夹");
        } else {
            System.out.println(file.getName() + "不是文件夹");
        }
    }
}
