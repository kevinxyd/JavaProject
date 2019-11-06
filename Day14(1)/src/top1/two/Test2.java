package top1.two;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test2 {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1","a");
        hashMap.put("2","b");
        System.out.println("=======for加强循环=======");
        Set<String> strings = hashMap.keySet();
        for (String strs:strings) {
            System.out.println(strs);
        }
        System.out.println("=======迭代器=======");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
