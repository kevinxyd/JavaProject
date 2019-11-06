package com.day4.one;

public class Test9 {
    public static void main(String[] args) {
        cheng();
    }

    private static void cheng() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }

}
