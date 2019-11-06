package top2.serviceImpl;

import java.util.HashMap;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < sc.length(); i++) {
            char c = sc.charAt(i);
            if (!hashMap.containsKey(c)){
                hashMap.put(c,1);
            } else {
                Integer count = hashMap.get(c);
                hashMap.put(c,count+1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(hashMap);
        System.out.println(stringBuilder);
    }
}
