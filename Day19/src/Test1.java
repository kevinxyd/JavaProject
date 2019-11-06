import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("e:\\a.txt"));
        bufferedOutputStream.write(5);
        bufferedOutputStream.close();
    }
}
