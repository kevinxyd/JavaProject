package com.six;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CountLiveTest {
    public static void main(String[] args) throws ParseException {
        String birthday = "1998年2月21日";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年mm月dd日");
        Date myDate = simpleDateFormat.parse(birthday);
        Date nowDate = new Date();

        //将两个日期转换成毫秒
        long myDateSecond = myDate.getTime();
        long nowDateSecond = nowDate.getTime();
        //计算差
        long second = nowDateSecond - myDateSecond;
        System.out.println(birthday + "出生的你,直至今天,共生活" + second/1000/60/60/24 + "天");
    }
}
