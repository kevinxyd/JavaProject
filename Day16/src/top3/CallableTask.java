package top3;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int num = 0;
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(100)+1;
            num += number;
        }
        return num/10;
    }
}
