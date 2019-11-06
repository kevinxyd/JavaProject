package top1.five;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("邓超","孙俪");
        hashMap.put("李晨","范冰冰");
        hashMap.put("刘德华","刘岩");
        hashMap.put("黄晓明","Baby");
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String > en = iterator.next();
            System.out.println(en.getKey() + en.getValue());
        }
    }
}
