package top1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("e://a//a.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("e://a//b.jpg");
        byte[] bytes = new byte[1];
        while (fileInputStream.read(bytes) !=  -1){
            fileOutputStream.write(bytes);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
