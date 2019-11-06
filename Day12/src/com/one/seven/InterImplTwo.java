package com.one.seven;

public class InterImplTwo<E> implements Inter<E> {
    @Override
    public void show(E e) {
        System.out.println("我是不确定的泛型:" + e);
    }
}
