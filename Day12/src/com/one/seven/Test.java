package com.one.seven;

public class Test {
    public static void main(String[] args) {
        InterImplOne interImplOne = new InterImplOne();
        InterImplTwo<Integer> interImplTwo = new InterImplTwo<>();
        interImplOne.show("我是字符串");
        interImplTwo.show(123);
    }
}
