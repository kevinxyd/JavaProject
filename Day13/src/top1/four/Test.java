package top1.four;

import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.addFirst("d");
        linkedList.addLast("e");
        //获取集合首个元素
        String start = linkedList.getFirst();
        System.out.println(start);
        //获取集合末尾元素
        String end = linkedList.getLast();
        System.out.println(end);
        //删除首个元素
        linkedList.removeFirst();
        System.out.println(linkedList);
        //删除末尾元素
        linkedList.removeLast();
        System.out.println(linkedList);
    }

}
