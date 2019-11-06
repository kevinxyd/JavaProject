package top2.ten;

import java.util.HashMap;
import java.util.Set;

public class Test10 {
    public static void main(String[] args) {
        String[] strings = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        String[] strings1 = {"哈尔滨","杭州","南昌","广州","福州"};

        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            hashMap.put(strings[i],strings1[i]);
        }
        System.out.println(hashMap);
    }
}
