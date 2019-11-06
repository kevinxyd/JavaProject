package top2.seven;

import java.util.HashMap;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容");
        String str = scanner.nextLine();
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] c = str.split("");
        for (int i = 0; i < c.length; i++) {
            if (!hashMap.containsKey(c[i])){
                hashMap.put(c[i],1);
            } else {
                Integer count = hashMap.get(c[i]);
                hashMap.put(c[i],count+1);
            }
        }
        System.out.println(hashMap);
    }
}
