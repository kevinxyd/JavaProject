package test7;

public class MyDateTest {
    public static void main(String[] args) {
        //实例化MyDate对象并赋值
        MyDate myDate=new MyDate(1900,1,1);
        myDate.showDate();//打印日期
        myDate.isBi(myDate.getYear());//判断闰年
    }
}
