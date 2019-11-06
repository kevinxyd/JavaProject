package top2.serviceImpl;

import java.io.File;
import java.io.FileFilter;

public class Filter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        boolean flag = false;
        File[] files = pathname.listFiles();
        assert files != null;
        for (File file:files){
            flag = file.getName().endsWith(".java");
        }
        return flag;

    }
}
