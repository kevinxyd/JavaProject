package top2.one;

import java.util.HashMap;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入五条信息，格式为姓名，年龄");
        String s = "";
        int count = 0;
        while (hashMap.size() < 5){
            s = scanner.next();
            String[]  strs= s.split(",");
            hashMap.put(strs[0],strs[1]);
        }
        System.out.println(hashMap);

    }
}
