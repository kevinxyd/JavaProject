public class Test2 {

    public static void main(String[] args) {
       //定义一个变量sum
        int sum=0;
        //for循环计算1-100的奇数和
        for (int i = 1; i <= 100; i++) {
            //判断i是否为奇数
            if (i%2!=0){
                //累加奇数的和
                sum+=i;
            }
        }
        System.out.println("1-100的奇数累加和：|"+sum);
    }

}
