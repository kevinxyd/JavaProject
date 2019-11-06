package top2.two;

import java.util.HashMap;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("柳岩",2100);
        hashMap.put("张良",1700);
        hashMap.put("诸葛亮",1800);
        hashMap.put("灭绝师太",2600);
        hashMap.put("东方不败", 3800);

        int pay = hashMap.get("柳岩");
        hashMap.put("柳岩",pay+300);
        Set<String> keySet = hashMap.keySet();
        for (String s:keySet) {
            System.out.println(s + hashMap.get(s));
        }
    }
}
