package com.day4.two;

public class Test9 {
    public static void main(String[] args) {
        String[] zimu={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] hanzi={"黑桃","红桃","梅花","方片"};

        for (int i = 0; i < hanzi.length; i++) {
            for (int j = 0; j < zimu.length; j++) {
                System.out.print(hanzi[i]+zimu[j]+" ");
            }
            System.out.println();
        }
    }
}
