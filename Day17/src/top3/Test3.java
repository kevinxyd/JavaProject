package top3;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        File file = new File(str);
        Map<String,Integer> map =  printDetroy(file);
        System.out.println(map);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry entry:entries) {
            System.out.println(entry.getKey() + "" + entry.getValue());
        }
        Set<String> strings = map.keySet();
        for (String s:strings) {
            System.out.println(s + map.get(s));
        }
    }

    private static Map printDetroy(File file) {
        File[] files = file.listFiles(pathname -> pathname.getName().endsWith(".java")
               || pathname.getName().endsWith(".doc") || pathname.getName().endsWith(".txt") || pathname.isDirectory());
        Map<String, Integer> hashMap = new HashMap<>();
        //File[] files = file.listFiles();
        int javaNumber = 0;
        int txtNumber = 0;
        int docNumber = 0;
        for (File file1:files) {
            if (file1.isFile()){
                if (file1.getName().endsWith("java")){
                    hashMap.put("java", ++javaNumber);
                } else if (file1.getName().endsWith("txt")){
                    hashMap.put("txt", ++txtNumber);
                } else if (file1.getName().endsWith("doc")){
                    hashMap.put("doc", ++docNumber);
                }
            } else {
                printDetroy(file1);
            }
        }
        return hashMap;
    }
}
