package top2.three;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {

        String[] strs ={"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> linkedList =new LinkedList<>();
        //遍历strs
        for (int i = 0; i <strs.length ; i++) {
            if (linkedList.contains(strs[i])){
                continue;
            }else {
                linkedList.add(strs[i]);
            }
        }
        //遍历linkedList
        for (String str:linkedList) {
            System.out.println(str);
        }
        //遍历iterator
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println("qq号:"+iterator.next());
        }
    }
}
