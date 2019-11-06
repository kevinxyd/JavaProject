package top9;


import jdk.management.resource.internal.inst.InitInstrumentation;

import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(4);
        Map<String,Integer> map = new HashMap<>();
        map.put("1",5);
        map.put("2",6);
        new Thread(new Runnable() {
            @Override
            public void run() {
                //遍历list
                System.out.println("=====list======");
                for (Integer integer:list) {
                    System.out.println(integer);
                }
                //遍历set
                System.out.println("=====set======");
                for (Integer integer:set) {
                    System.out.println(integer);
                }
                //遍历map
                System.out.println("=====map======");
                Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
                for (Map.Entry<String,Integer> map:entrySet) {
                    System.out.println(map.getKey() + " " + map.getValue());
                }
            }
        }).start();
    }
}
