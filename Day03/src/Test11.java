public class Test11 {

    public static void main(String[] args) {
        //打印等腰三角
        for(int i = 1; i<=5 ; i++) {
            //控制空格
            for (int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            //控制星数
            for (int x = 1; x <= 2*i- 1; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
