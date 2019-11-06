package top2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;


public class Test4 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        File file = new File("e://a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        Set<String> strings = properties.stringPropertyNames();
        for (String str:strings) {
            if (str.equals("lisi")){
                properties.setProperty(str,"100");
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        for (String str:strings) {
            fileOutputStream.write((str + "=" + properties.getProperty(str)+ "\n").getBytes());
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
