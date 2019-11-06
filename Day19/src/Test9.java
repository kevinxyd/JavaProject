import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ‰»Îƒ⁄»›£∫");
        String sc = scanner.next();
        PrintStream printStream = new PrintStream("d.txt");
        printStream.write(sc.getBytes());
        printStream.close();
    }
}
