package top17;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File dir = new File("");
        File f = new File(dir.getAbsolutePath());
        printDir(f);
    }

    private static void printDir(File f) {
        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java") || pathname.isDirectory();
            }
        });
        for (File file1:files) {
            if (file1.isFile()){
                System.out.println(file1.getAbsolutePath());
            } else  {
                printDir(file1);
            }
        }
    }


}
