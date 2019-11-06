

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("a.txt");
        fileWriter.write(97);
        fileWriter.write(30000);
        fileWriter.write(45);
        fileWriter.close();
        FileWriter fileWriter1 = new FileWriter("b.txt");

    }
}
