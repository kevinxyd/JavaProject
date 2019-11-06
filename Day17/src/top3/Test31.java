package top3;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Test31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        File file = new File(path);
        HashMap<String, Integer> hashMap = new HashMap<>();
        getTol(file,hashMap);
    }

    private static void getTol(File file, HashMap<String, Integer> hashMap) {
    }
}
