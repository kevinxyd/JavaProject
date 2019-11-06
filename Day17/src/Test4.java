import java.io.File;

public class Test4 {

    public static void main(String[] args) {
        File f = new File(new File("").getAbsolutePath());
        printFile(f);
    }

    private static void printFile(File dir) {
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f);
            } else {
                System.out.println(f);
                printFile(f);
            }
        }
    }
}
