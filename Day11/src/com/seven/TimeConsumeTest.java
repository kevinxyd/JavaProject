package com.seven;

public class TimeConsumeTest {
    public static void main(String[] args) {
        String str = "a";
        TimeConsumeTest.countUseStringTime(str);
        //创建Stringbuilder对象
        StringBuilder stringBuilder = new StringBuilder();
        TimeConsumeTest.countUseStringBuliderTime(stringBuilder);
    }
    ////使用String拼接字符串花费的时间
    public static void countUseStringTime(String str){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("使用String拼接共花费" + (end-start) + "毫秒");
    }

    //使用StringBuilder拼接字符串花费的时间
    public static void countUseStringBuliderTime(StringBuilder stringBuilder){
        long stringBuilderStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i);
        }
        long stringBuilderEnd = System.currentTimeMillis();
        System.out.println("使用StringBuilder拼接共花费" + (stringBuilderEnd-stringBuilderStart) + "毫秒");
    }
}
