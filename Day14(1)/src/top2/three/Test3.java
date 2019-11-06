package top2.three;

import java.util.HashMap;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"张三丰");
        hashMap.put(2,"周芷若");
        hashMap.put(3, "灭绝师太");
        Set<Integer> keySet = hashMap.keySet();
        for (Integer s:keySet) {
            System.out.println(s + hashMap.get(s));
        }
        hashMap.put(5,"李晓红");
        hashMap.remove(1);
        hashMap.put(2,"周林");
        System.out.println(hashMap);
    }
}
