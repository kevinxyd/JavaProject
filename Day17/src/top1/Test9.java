package top1;


public class Test9 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(sum(num));
    }

    private static int sum(int num) {
        if (num == 1){
            return 1;
        }
        return num + sum(num - 1);
    }

}
