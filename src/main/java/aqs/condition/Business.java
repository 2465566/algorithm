package aqs.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Business {

  ReentrantLock lock = new ReentrantLock();
  Condition conditionA = lock.newCondition();
  Condition conditionB = lock.newCondition();
  Condition conditionC = lock.newCondition();
  String flag = "A"; //internal thread.status

  public void printA() {
    lock.lock();
    try {
      while (!"A".equals(flag)) {
        try {
          conditionA.await();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      System.out.println("print A");
      flag = "B";
      conditionB.signal();
    } finally {
      lock.unlock();
    }
  }

  public void printB() {
    lock.lock();
    try {
      while (!"B".equals(flag)) {
        try {
          conditionB.await();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      System.out.println("print B");
      flag = "C";
      conditionC.signal();
    } finally {
      lock.unlock();
    }
  }

  public void printC() {
    lock.lock();
    try {
      while (!"C".equals(flag)) {
        try {
          conditionC.await();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      System.out.println("print C");
      flag = "A";
      conditionA.signal();
    } finally {
      lock.unlock();
    }
  }
}


