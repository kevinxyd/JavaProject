import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("e://a//a.jpg"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("e://b.jpg"));
        byte[] b = new byte[1];
        int len;
        while ((len = bufferedInputStream.read(b)) != -1){
            bufferedOutputStream.write(b,0,len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
