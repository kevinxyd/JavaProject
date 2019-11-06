package top11;

public class Test11 {
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        Thread thread1 = new Thread(threadTest,"前门");
        Thread thread2 = new Thread(threadTest,"后门");
        thread1.start();
        thread2.start();
    }
}
