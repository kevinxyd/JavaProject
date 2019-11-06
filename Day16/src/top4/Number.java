package top4;

public class Number implements Runnable {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(getNumber(getNumber()));
    }
    //计算阶乘
    public String getNumber(int number) {
        long sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        return number + " 的阶乘为:" + sum;
    }
}
