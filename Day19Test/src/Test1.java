import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file),"GBK");
        int lin;
        while ((lin = inputStreamReader.read()) != -1){
            System.out.print((char)lin);
        }
    }
}
