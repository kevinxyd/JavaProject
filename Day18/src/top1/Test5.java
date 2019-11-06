package top1;

import java.io.FileInputStream;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("e://a.txt");
        byte[] bytes = new byte[2];
        while (fileInputStream.read(bytes) !=  -1){
            System.out.println(new String(bytes));
        }
        fileInputStream.close();
    }
}
