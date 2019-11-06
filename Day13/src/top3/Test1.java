package top3;

import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        while (hashSet.size() < 6){
            int number = (int)(Math.random()*33+1);
            hashSet.add("红球"+"-"+String.valueOf(number));
        }
        int number = (int)(Math.random()*16+1);
        if (hashSet.size() < 7){
            hashSet.add("蓝球"+number);
        }
        System.out.println(hashSet);

    }
}
