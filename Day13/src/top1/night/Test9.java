package top1.night;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(11);
        list.add(77);
        list.add(55);
        //给集合排序
        Collections.sort(list);
        System.out.println(list);
        //打乱顺序
        Collections.shuffle(list);
        System.out.println(list);
        //反转集合
        Collections.reverse(list);
        for (Integer integer:list) {
            System.out.println(integer);
        }
    }
}
