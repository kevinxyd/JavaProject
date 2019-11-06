package top9;

public class Arth implements Runnable {
    @Override
    public void run() {
        synchronized (Arth.class) {
            String print = getNumber(Integer.parseInt(Thread.currentThread().getName()));
            System.out.println(print);
        }
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
