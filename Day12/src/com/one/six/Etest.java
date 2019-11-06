package com.one.six;

public class Etest {
    public static void main(String[] args) {
        Etest.getT("我是字符串");
        Etest.getT(123);
    }

    public static <T> void getT(T t){
        System.out.println(t);
    }
}
