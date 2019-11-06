package top1.eight;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test8 {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("王昭君");
        linkedHashSet.add("王昭君");
        linkedHashSet.add("西施");
        linkedHashSet.add("杨玉环");
        linkedHashSet.add("貂蝉");

        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String str:linkedHashSet) {
            System.out.println(str);
        }
    }
}
