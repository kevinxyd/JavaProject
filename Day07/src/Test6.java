import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        str=str.replace("奥巴马","*");
        System.out.println(str);
    }
}
