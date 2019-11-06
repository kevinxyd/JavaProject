package com.day4.one;

public class Test6 {
    public static void main(String[] args) {
        printX();
    }
    private static void printX() {
        String q="";
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i==j || i+j==11){
                    q="O";
                } else {
                    q="*";
                }
                System.out.print(q);
            }
            System.out.println();
        }
    }

}
