package top2.five;


import java.util.ArrayList;
import java.util.HashSet;

public class Test5 {
    public static void main(String[] args) {

        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
        HashSet<String> hashSet =new HashSet<>();
        for (String s:arr) {
            hashSet.add(s);
        }
        ArrayList<String> list =new ArrayList<>();
        list.addAll(hashSet);
        for (String str:list) {
            System.out.println(str);
        }
    }
}
