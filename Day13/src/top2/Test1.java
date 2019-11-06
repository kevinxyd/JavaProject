package top2;

import java.util.ArrayList;
import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<>();

        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");

        HashSet<String> hashSet =new HashSet<>();
        //添加到hashset
        hashSet.addAll(list);
        //清空
        list.clear();
        //添加的到hashset
        list.addAll(hashSet);
        System.out.println(list);
    }
}
