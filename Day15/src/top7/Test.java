package top7;

public class Test {
    public static void main(String[] args) {
        Bus waterClass = new Bus();
        Thread thread1 = new Thread(waterClass,"前门");
        Thread thread2 = new Thread(waterClass,"中门");
        Thread thread3 = new Thread(waterClass,"后门");
        thread2.start();
        thread1.start();
        thread3.start();
    }
}
