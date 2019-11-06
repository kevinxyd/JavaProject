package com.day4.two;

public class Test4 {
    public static void main(String[] args) {
        int[] arr={1,8,10,18,28,12};
        printBall(arr);
    }

    private static void printBall(int[] arry) {
        System.out.println("您的双色球号码为：");
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+" ");
        }
    }
}
