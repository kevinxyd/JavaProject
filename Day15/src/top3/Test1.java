package top3;

public class Test1 {
    public static void main(String[] args) {
        Test1Thread test1Thread = new Test1Thread();
        test1Thread.start();
        System.out.println("主线程1");


        Test2Runnable test2Runnable = new Test2Runnable();
        Thread thread = new Thread(test2Runnable);
        thread.start();
        System.out.println("主线程2");
    }
}
