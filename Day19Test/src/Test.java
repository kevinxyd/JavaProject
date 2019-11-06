import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> hashMap = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] split = line.split("\\.");
            hashMap.put(split[0],split[1]);
        }
        bufferedReader.close();
        Set<String> strings = hashMap.keySet();
        for (String s:strings) {
            bufferedWriter.write(s + "." + hashMap.get(s));
            bufferedWriter.newLine();
        }
        /*for (int i = 1; i < hashMap.size(); i++) {
            String key = String.valueOf(i);
            String value = hashMap.get(key);
            bufferedWriter.write(key + "." + value);
            bufferedWriter.newLine();
        }*/
        bufferedWriter.close();
    }
}
