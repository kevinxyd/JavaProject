package top1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("e://a.txt");
        byte[] bytes = {99,97,98};
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
