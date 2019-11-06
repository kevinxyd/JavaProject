package com.singleton.pattern;

public class SingletonLazy {
    public static void main(String[] args) {
        President zt1=President.getInstance();
        zt1.getName();
        President zt2=President.getInstance();
        zt2.getName();
        if (zt1 == zt2){
            System.out.println("特们是同一人");
        } else {
            System.out.println("特们不是同一人");
        }
    }
}
