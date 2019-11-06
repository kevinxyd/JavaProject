package top1;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        File file = new File(new File("").getAbsolutePath());
        File file1 = new File(new File("").getAbsolutePath());
        file.delete();
        file.delete();

    }
}
