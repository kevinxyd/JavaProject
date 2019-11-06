import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("e:\\a.txt"));
        String content = "i love you";
        bufferedOutputStream.write(content.getBytes());
        bufferedOutputStream.close();
    }
}
