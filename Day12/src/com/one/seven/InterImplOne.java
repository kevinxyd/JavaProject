package com.one.seven;

public class InterImplOne implements Inter<String> {
    @Override
    public void show(String s) {
        System.out.println("我是第一种方式的泛型:" + s);
    }
}
