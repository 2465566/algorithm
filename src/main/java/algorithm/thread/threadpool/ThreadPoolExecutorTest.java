package algorithm.thread.threadpool;

import java.util.concurrent.*;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(5, 10, 20, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5));
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                public void run() {
                    System.out.println(System.currentTimeMillis());
                }
            });
        }
    }
}
