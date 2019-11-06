package com.three;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateTest {
    public static void main(String[] args) {
        //创建日期对象
        Date date = new Date();
        //创建SimpleDateFormat并规定格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        //将当前日期转换为所规定的日期格式
        String str = simpleDateFormat.format(date);
        System.out.println(str);

    }
}
