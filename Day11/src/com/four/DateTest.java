package com.four;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        //声明SimpleDateFormat对象，并规定日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        //将传入的日期转换为日期对象
        Date date = simpleDateFormat.parse("1992-10-20");
        System.out.println(date);
    }
}
