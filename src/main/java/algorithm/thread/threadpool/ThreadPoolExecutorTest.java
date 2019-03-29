package algorithm.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                public void run() {
                    System.out.println(System.currentTimeMillis());
                }
            });
        }

        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            newFixedThreadPool.submit(new Runnable() {
                public void run() {
                    System.out.println(System.currentTimeMillis());
                }
            });
        }

        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            newSingleThreadExecutor.submit(new Runnable() {
                public void run() {
                    System.out.println(System.currentTimeMillis());
                }
            });
        }

        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(3);
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println(System.currentTimeMillis());
            }
        }, 1, 3, TimeUnit.SECONDS);  // 参数： 1 秒后每隔三秒执行一次。
    }
}
