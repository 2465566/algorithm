package aqs;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

  public static void main(String[] args) {
    ReentrantLock reentrantLock = new ReentrantLock(true);  //true 公平锁

    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("thread1 加锁");
        reentrantLock.lock();          //加锁
        try {
          Thread.sleep(100000000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        reentrantLock.unlock();        //解锁
        System.out.println("thread1 解锁");

      }
    });

    thread1.start();

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("thread2 加锁");
        reentrantLock.lock();          //加锁
        try {
          Thread.sleep(200000000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        reentrantLock.unlock();        //解锁
        System.out.println("thread2 解锁");
      }
    });

    thread2.start();

    Thread thread3 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("thread3 加锁");
        reentrantLock.lock();          //加锁
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        reentrantLock.unlock();        //解锁
        System.out.println("thread3 解锁");
      }
    });

    thread3.start();
  }
}
