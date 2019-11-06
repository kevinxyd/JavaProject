public class Test9 {

    public static void main(String[] args) {
        //嵌套循环遍历7行7列
        String q="";
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                //当i==j或者i与j的和为8时
                if (i==j || i+j==8){
                    q="O";
                }else{
                    q="*";
                }
                System.out.print(q);
            }
            System.out.println();
        }

    }

}
