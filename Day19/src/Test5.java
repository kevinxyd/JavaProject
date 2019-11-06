import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter gbk = new OutputStreamWriter(new FileOutputStream("a.txt"), "GBK");
        gbk.write("我爱java");
        gbk.flush();
        gbk.close();
    }
}
