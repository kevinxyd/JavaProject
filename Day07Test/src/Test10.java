import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=1;
        int a1=1;
        int b=1;
        int b1=1;
        System.out.println("当前数据结果是：");
        System.out.println(a+" "+a1);
        System.out.println(b+" "+b1);
        while (a != 0 || a1!=0 || b != 0 || b1 !=0){
            System.out.println("请说明，你要拿第几号数去碰电脑的第几号数，例如1 1");
            int number=sc.nextInt();//1代表a，2代表a1
            int internumber=sc.nextInt();//1代表b，2代表b1
            System.out.println("当前数据结果是：");
            if (number == 1 && internumber == 1){
                System.out.println(b+" "+b1);//电脑的数
                System.out.println(a+b+" "+a1);//玩家的数
            }
        }


    }
    public static void getResult(int number,int internumber){

    }


}
