import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
       //
        //InputStreamReader gbk1 = new InputStreamReader(new FileInputStream("a.txt"));
        OutputStreamWriter gbk2 = new OutputStreamWriter(new FileOutputStream("a.txt"), "UTF-8");
        gbk2.write("|你好");

        gbk2.close();
        InputStreamReader gbk = new InputStreamReader(new FileInputStream("a.txt"), "GBK");
        int read;
        while ((read = gbk.read()) != -1){
           System.out.println((char)read);
        }
        gbk.close();
    }
}
