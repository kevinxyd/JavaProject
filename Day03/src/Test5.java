public class Test5 {

    public static void main(String[] args) {
        //循环打印15以内不是3的倍数的数字
        for (int i = 1; i <= 15; i++) {
            //如果是3的倍数则跳出循环
            if(i%3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

}
