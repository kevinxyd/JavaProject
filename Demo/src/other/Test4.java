package other;

public class Test4 {
    public static void main(String[] args) {
        new Thread(() -> {
            while (true){
                synchronized (Test4.class){
                    try {
                        System.out.println("等待唤醒");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"等待线程").start();

        new Thread(() -> {
            while (true){
                synchronized (Test4.class){
                    try {
                        Thread.sleep(500);
                        System.out.println("唤醒锁");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Test4.class.notify();
                }
            }
        },"开始线程").start();
    }
}
