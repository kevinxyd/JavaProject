package top2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\d1");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        File[] files = file.listFiles();
        for (File f:files) {
            if (f.isFile()){
                fileInputStream = new FileInputStream(f);
                fileOutputStream = new FileOutputStream("e://d2//" + f.getName());
                int len;
                while ((len = fileInputStream.read()) != -1){
                    fileOutputStream.write(len);
                }
            }
        }
        assert fileOutputStream != null;
        fileOutputStream.close();
        fileInputStream.close();
    }
}
