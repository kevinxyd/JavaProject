package com.day4.one;

public class Test8 {
    public static void main(String[] args) {
        System.out.println("摄氏度为：30.0--华氏度为"+temperatureConverter(30.0));
        System.out.println("华氏度为：86.0--摄氏度为"+temperatureConverter2(86.0));
    }
    //摄氏度转华氏度
    private static double temperatureConverter(double temperature) {
        return  (9.0/5)*temperature+32;
    }
    //华氏度转摄氏度
    private static double temperatureConverter2(double temperature) {
        return  (temperature-32)/(9.0/5);
    }
}
