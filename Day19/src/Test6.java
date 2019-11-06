import java.io.*;

public class Test6 {
    public static void main(String[] args) throws IOException {
        InputStreamReader gbk = new InputStreamReader(new FileInputStream("a.txt"),"GBK");
        int len;
        while ((len = gbk.read()) != -1){
            System.out.println((char)len);
        }
        gbk.close();
    }
}
