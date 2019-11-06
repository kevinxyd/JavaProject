package com.one.three;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    /***
     *
     * */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
