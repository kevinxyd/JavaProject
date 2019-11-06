package top1;

import java.io.File;

public class Test6 {
    public static void main(String[] args) {
        File file = new File(new File("").getAbsolutePath());
        System.out.println("文件名：" + file.getName());
        System.out.println("文件大小：" + file.length());
        System.out.println("文件的绝对路径：" + file.getAbsolutePath());
        System.out.println("文件的父路径：" + file.getParent());
    }
}
