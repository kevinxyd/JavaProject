package top4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test4 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        Number number1 = new Number(10);
        Number number2 = new Number(5);
        service.submit(number1);
        service.submit(number2);
    }
}
