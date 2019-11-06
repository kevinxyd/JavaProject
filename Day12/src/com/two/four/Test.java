package com.two.four;

public class Test {
    public static void main(String[] args) {
        String[] strs = {"a","b","d","c"};
        Test.swap(strs,0,3);
        Integer[] integers = {1,2,3,4,5};
        Test.swap(integers,1,3);
    }

    public static <T> void swap(T[] t,int index,int index2){
        T t1 = t [index];
        t[index] = t[index2];
        t[index2] = t1;
        for (T t2 : t) {
            System.out.print(t2);
        }
        System.out.println();
    }
}
