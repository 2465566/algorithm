package thread.prodcerconusmer;

import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class ElementBuffer {

  public static volatile ElementBuffer elementBuffer = null;

  private List<String> elementList = Lists.newArrayList();

  ElementBuffer() {
  }

  public static ElementBuffer getElementBuffer() {
    if (elementBuffer == null) {
      synchronized (ElementBuffer.class) {
        elementBuffer = new ElementBuffer();
      }
    }
    return elementBuffer;
  }

  public synchronized void addElement() {   //synchronized 修饰普通方法，默认对当前对象加锁；修饰静态方法，对当前类加锁。
    int waitCount = 0;
    while (elementList.size() >= 2) {
      try {
        System.out.println(
            "producer thread: " + String.valueOf(Thread.currentThread().getName()) + " wait "
                + String.valueOf(++waitCount) + " until elements less than 2");
        elementBuffer.wait();          // wait()方法，放锁，线程等待，线程栈中保存了当前代码执行的位置，等待被唤醒继续执行。
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println(
        "add element:" + String.valueOf(System.currentTimeMillis()) + "threadId:" + Thread
            .currentThread().getId());

    elementList.add(String.valueOf(System.currentTimeMillis()));
    //elementBuffer.notify(); notify will result in hook lock
    elementBuffer.notifyAll();
  }


  public synchronized void removeElement() {
    int waitCount = 0;
    while (CollectionUtils.isEmpty(elementList)) {
      try {
        System.out.println(
            "consumer thread: " + String.valueOf(Thread.currentThread().getName()) + " wait "
                + String.valueOf(++waitCount) + " until elements more than 1");
        elementBuffer.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println(
        "remove element:" + elementList.get(elementList.size() - 1) + "threadId:" + Thread
            .currentThread().getName());
    elementList.remove(elementList.size() - 1);
    //elementBuffer.notify();  notify will result in hook lock
    elementBuffer.notifyAll();
  }
}
