package top1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("e://a//a.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("e://a//b.jpg");
        int len;
        while ((len = fileInputStream.read()) !=  -1){
            fileOutputStream.write(len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
