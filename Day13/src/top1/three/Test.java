package top1.three;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        LinkedList<String> linkedList =new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        System.out.println(linkedList);
        //修改指定元素
        linkedList.set(2,"g");
        System.out.println(linkedList);
        //获取指定下标元素
        String str = linkedList.get(3);
        System.out.println(str);
        //获取集合长度
        int size = linkedList.size();
        System.out.println(size);
        //删除指定下标元素
        linkedList.remove(3);
        System.out.println(linkedList);
        //清空集合
        linkedList.clear();
        System.out.println(linkedList);

    }
}
