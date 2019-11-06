package top1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("e://a.txt");
        fileOutputStream.write(97);
        fileOutputStream.close();
    }
}
