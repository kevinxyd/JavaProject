package top2.night;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
        //添加集合
        list1.add("a");
        list1.add("b");
        list1.add("a");
        list1.add("c");
        list1.add("d");
        list2.add("e");
        list2.add("f");
        list2.add("a");
        list2.add("d");
        list2.add("g");

        //将list1放入hashset
        for (String strs:list1) {
            hashSet.add(strs);
        }
        //将list2放入hashset
        for (String strs2:list2) {
            hashSet.add(strs2);
        }
        //去除重复数字遍历
        for (String strset:hashSet) {
            System.out.print(strset + " ");
        }

    }
}
