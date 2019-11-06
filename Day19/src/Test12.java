import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test12 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("a.txt");
        File file = new File("b.txt");
        if (!file.exists()){
            //复制文件
            Files.copy(path, Paths.get(file.getName()));
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String len;
        while ((len = bufferedReader.readLine()) != null){
            System.out.println(len);
        }
        bufferedReader.close();
    }
}
