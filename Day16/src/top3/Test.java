package top3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        CallableTask callableTask1 = new CallableTask();
        Future<Integer> f1 = service.submit(callableTask1);
        Future<Integer> f2 = service.submit(callableTask1);
        Future<Integer> f3 = service.submit(callableTask1);
        try {
            System.out.println("第一个线程的平均数:" + f1.get());
            System.out.println("第一个线程的平均数:" + f2.get());
            System.out.println("第一个线程的平均数:" + f3.get());
            int sumAvg = (f1.get() + f2.get() + f3.get())/3;
            System.out.println("三个线程的平均数:" + sumAvg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
