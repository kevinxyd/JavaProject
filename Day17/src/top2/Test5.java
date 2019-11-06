package top2;

import java.io.File;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        File file = new File(str);
        File[] files = file.listFiles();
        for (File file1:files) {
            //如果是文件直接删除
            if (file1.isFile()){
                file1.delete();
            } else {
                //如果是文件夹
                File[] files1 = file1.listFiles();
                //删除文件夹中的内容
                for (File file2:files1) {
                    file2.delete();
                }
                //最后删除文件夹
                file1.delete();
            }
        }
    }
}
