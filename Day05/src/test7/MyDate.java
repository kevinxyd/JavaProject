package test7;

public class MyDate {
    private int year;//年
    private int month;//月
    private int day;//日

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    //打印日期
    public void showDate(){
        System.out.println("日期："+year+"年"+month+"月"+day+"日");
    }
    //判断当前日期是否是闰年
    public void isBi(int year){
        if (year%100 != 0 && year%4 == 0 ){//普通年判断
            System.out.println(year+"年是闰年");
        } else if (year%100 == 0 && year%400 == 0 ){//世纪年判断
            System.out.println(year+"年是闰年");
        } else {
            System.out.println(year+"年不是闰年");
        }
    }
}
