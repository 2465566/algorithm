package aqs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

  public static void main(String[] args) {
    Semaphore semaphore = new Semaphore(3);  //现在允许操作的资源一共有3个

    ExecutorService executorService = Executors.newCachedThreadPool();

    for (int i = 0; i < 8; i++) {
      executorService.execute(new Runnable() {
        @Override
        public void run() {
          try {
            semaphore.acquire();    //如果能获取到资源，继续执行，获取不到阻塞，直到有资源被其他线程释放
            System.out.println("action---" + Thread.currentThread().getName());
            Thread.sleep(2000);
            semaphore.release();    // 释放资源
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      });
    }
  }
}
