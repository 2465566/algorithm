package aqs;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchTest {

  public static void main(String[] args) throws InterruptedException {
    CountDownLatch countDownLatch = new CountDownLatch(10);

    ExecutorService executorService = Executors.newCachedThreadPool();

    for (int i = 0; i < 6; i++) {               // 8<10 所以  System.out.println("end"); 将不会执行。
//      for (int i = 0; i < 11; i++) {          // 11>10 所以  System.out.println("end"); 会执行。
      executorService.execute(new Runnable() {
        @Override
        public void run() {
          try {
            countDownLatch.countDown();   // 减1
            System.out.println("action---" + Thread.currentThread().getName());

          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      });
    }

    /**
     * 线程外等待
     */
    countDownLatch.await();     // 一直阻塞
//    countDownLatch.await(10, TimeUnit.SECONDS);    // 期限阻塞，就算没有减少到0， 10秒之后不再等待 继续执行后面代码。
    System.out.println("end");
  }
}
