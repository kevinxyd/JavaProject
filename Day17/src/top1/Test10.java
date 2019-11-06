package top1;

public class Test10 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(jieCheng(num));
    }

    private static int jieCheng(int num) {
        if (num == 1){
            return 1;
        }
        return num * jieCheng(num - 1);
    }
}
