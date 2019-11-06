package top1;

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("e://a.txt");
        int len;
        while ((len = fileInputStream.read()) != -1){
            System.out.println((char)len);
        }
        fileInputStream.close();
    }
}
