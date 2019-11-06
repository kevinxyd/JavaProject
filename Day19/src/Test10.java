import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test10 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test1.txt"));
        String len;
        while ((len = bufferedReader.readLine()) != null){
            list.add(len);
        }
        bufferedReader.close();
        Collections.reverse(list);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test1.txt"));
        for (String s:list) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
