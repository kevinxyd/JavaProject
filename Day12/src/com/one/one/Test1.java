package com.one.one;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    /***
     *
     * 1、Collection的基本方法
     * add(E e) 把给定的对象添加到当前集合中
     * clear() 清空集合中所有的元素
     * remove(E e)  把给定的元素在当前集合中删除
     * contains(E e) 判断当前集合中是否包含给定的对象
     * idEmpty() 判断当前集合是否为空
     *
     * */

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("sdf");
        System.out.println("原collection:" + collection);

        collection.size();
        System.out.println("collection长度:" + collection.size());

        collection.remove("1");
        System.out.println("删除指定元素后的collection:" + collection);

        collection.clear();
        System.out.println("清空后的collection:" + collection);

    }
}
