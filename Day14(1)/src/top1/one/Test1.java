package top1.one;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1","a");
        hashMap.put("1","v");
        hashMap.put("2","v");
        hashMap.get("1");
        hashMap.remove("1");
        System.out.println(hashMap);


    }
}
