package top2.six;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        HashMap<Character, Integer> hashMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
        }
        for (int i = 0; i < stringBuilder.length(); i++) {
            char c = stringBuilder.charAt(i);
            if (!hashMap.containsKey(c)){
                hashMap.put(c,1);
            } else {
                Integer integer = hashMap.get(c);
                hashMap.put(c,integer+1);
            }
        }
        System.out.println(hashMap);
    }
}
