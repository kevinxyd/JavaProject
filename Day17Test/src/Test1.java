import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        String path = "e\\a";
        File file = new File(path);
        new File(file,"a");
    }
}
