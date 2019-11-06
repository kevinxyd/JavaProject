package top1.ten;

import java.util.ArrayList;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {

        System.out.println( add("1","2","3","4"));

    }

    private static ArrayList<String> add(String... str) {
        List<String> list = new ArrayList<>();
        for (String s:str) {
            list.add(s);
        }
        return (ArrayList<String>) list;
    }
}
