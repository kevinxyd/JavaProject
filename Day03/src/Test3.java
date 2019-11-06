public class Test3 {

    public static void main(String[] args) {
       //定义一个变量sum
        int sum=0;
        //循环遍历1-100的数字
        for (int i = 1; i <= 100; i++) {
            //判断数字既是3的倍数又是5的倍数
            if (i%3==0 && i%5==0){
                //累加这些数的和
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println("1-100之间既是3的倍数又是5的倍数的数字之和："+sum);
    }

}
