package aqs;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {

  public static void main(String[] args) {
    CyclicBarrier cyclicBarrier = new CyclicBarrier(10);  //当凑够10个线程金进行触发

    ExecutorService executorService = Executors.newCachedThreadPool();

    for (int i = 0; i < 8; i++) {
      executorService.execute(new Runnable() {
        @Override
        public void run() {
          try {
            cyclicBarrier.await();     // 在没有凑够10个线程的情况下，所有线程阻塞在这里，不往下执行。
            System.out.println("action---" + Thread.currentThread().getName());

          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      });
    }

    System.out.println("end");

  }
}
