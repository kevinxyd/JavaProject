package top3;

public class Test2Runnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable" + Thread.currentThread().getName());
    }
}
