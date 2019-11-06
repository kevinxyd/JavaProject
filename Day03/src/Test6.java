public class Test6 {

    public static void main(String[] args) {
        //循环遍历100-999中的数字
        for (int i = 100; i <= 999; i++) {
            int a=i/100;//百位
            int b=i/10%10;//十位
            int c=i%10;//个位
            //判断个位的立方 + 十位的立方 + 百位的立方等于这个数本身
            if ((c*c*c+b*b*b+a*a*a)==i){
                System.out.println(i);
            }
        }
    }

}
