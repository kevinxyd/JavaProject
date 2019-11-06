package com.five;

import java.util.Calendar;

public class CounterDateTest {
    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();
        //将当前日期往后推500天
        calendar.add(calendar.DAY_OF_YEAR,500);
        //获取500天后日历中的年
        int year = calendar.get(Calendar.YEAR);
        //获取500天后日历中的月
        int month = calendar.get(Calendar.MONTH);
        //获取500天后日历中的日
        int day = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}
