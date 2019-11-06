package com.one.five;

import java.util.ArrayList;
import java.util.List;

public class ForeachTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("xiaomi");
        list.add("xiaomi2");
        list.add("xiaomi3");
        list.add("xiaomi4");

        for (String str : list) {
            System.out.println(str);
        }
    }
}
