public class Test7 {

    public static void main(String[] args) {
        //定义变量count记录打印的数量
        int count=0;
        //循环1-60的偶数
        for (int i = 1; i <= 60; i++) {
            //判断偶数
            if(i%2 == 0){
                System.out.print(i+" ");
                //打印数量自增
                count++;
                //满足五个就换行
                if (count%5==0){
                    System.out.println();
                }
            }
        }

    }

}
