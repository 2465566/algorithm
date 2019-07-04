package thread.threadpool;

import java.util.concurrent.*;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        /**
         * 核心线程用完了，而且任务队列也满了，再有有新的任务才会基于核心线程数进行线程扩容，扩容的最大线程数为  最大线程数-核心线程数
         */
        ExecutorService executorService = new ThreadPoolExecutor(5, 10, 20, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                public void run() {
                    System.out.println(System.currentTimeMillis());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());

                }
            });
        }
    }
}
