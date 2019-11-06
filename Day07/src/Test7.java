import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个QQ号码：");
        String qq=sc.next();
        if (isNumeric(qq) && checkQQ(qq) && numberQQ(qq)){
            System.out.println("这个QQ号码是否正确："+true);
        } else {
            System.out.println("这个QQ号码是否正确："+false);
        }

    }
    //判断首位是否为0
    public static boolean checkQQ(String qq){
        if (qq.indexOf("0")==-1){
            return true;
        } else {
            return false;
        }
    }
    //判断qq号是否为5-12位
    public static boolean numberQQ(String qq){
        if (qq.length() >= 5 && qq.length() <= 12){
            return true;
        } else {
            return false;
        }
    }
    //判断是否由数字组成
    public static boolean isNumeric(String qq){
        for (int i = 0; i < qq.length(); i++){
            if (!Character.isDigit(qq.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
