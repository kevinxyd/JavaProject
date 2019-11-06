import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b=sc.nextInt();
        System.out.println("请输入第三个数据：");
        int c=sc.nextInt();

        int temp=a > b ? a : b;//比较ab的大小
        int max=temp > c ? temp : c;//比较abc的大小
        System.out.println("三个数的最大值："+max);
    }
}
