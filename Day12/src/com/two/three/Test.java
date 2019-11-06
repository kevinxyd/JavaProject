package com.two.three;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("a");

        System.out.println(Test.frequency(list,"b"));
    }

    public static int frequency(List<String> arr,String key){
        int count = 0;
        for (String str : arr) {
            //判断key与list集合中元素是否相等
            if (str.equals(key)){
                //计数
                count++;
            }
        }
        return count;
    }
}
