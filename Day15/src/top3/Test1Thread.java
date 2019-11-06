package top3;

public class Test1Thread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread" + Thread.currentThread().getName());
    }
}
