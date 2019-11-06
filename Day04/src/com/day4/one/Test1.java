package com.day4.one;

public class Test1 {
    public static void main(String[] args) {
        printEven(20);
    }

    private static void printEven(int n) {
        for (int i = 0; i <= n ; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
