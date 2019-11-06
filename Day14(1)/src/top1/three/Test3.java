package top1.three;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1","a");
        hashMap.put("2","b");
        Collection<String> values = hashMap.values();
        for (String string : values) {
            System.out.println(string);
        }
        System.out.println("========迭代器========");
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
