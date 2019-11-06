package other;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ExecutorProcessPool {


    private static ExecutorService executor;


    public static ExecutorService getInstance() {
        executor = ExecutorServiceFactory.getInstance().createFixedThreadPool(20);
        return executor;
    }

    public Future<?> submit(Runnable task) {
        return executor.submit(task);
    }


    public Future<?> submit(Callable<?> task) {
        return executor.submit(task);

    }
}
