package com.eight.one;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {
    public static void main(String[] args) throws ParseException {
        String str = "2016-01-26";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        //把str日期转为Date格式
        Date date = simpleDateFormat.parse(str);
        //更改simpleDateFormat格式为yyyy年mm月dd日
        simpleDateFormat.applyPattern("yyyy年mm月dd日");
        //把date日期转为String格式
        String end = simpleDateFormat.format(date);
        System.out.println(end);

    }
}
