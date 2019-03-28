package algorithm.thread;

import com.google.common.collect.Lists;
import java.util.List;

public class ThreadBuffer {

  public static volatile ThreadBuffer threadBuffer = null;

  private List<String> elementList = null;

  ThreadBuffer() {
    this.elementList = Lists.newArrayList();
  }

  public static ThreadBuffer getThreadBuffer() {
    if (threadBuffer == null) {
      synchronized (ThreadBuffer.class) {
        threadBuffer = new ThreadBuffer();
      }
    }
    return threadBuffer;
  }

  public List<String> addElement() {
    System.out.println("add element:" + String.valueOf(System.currentTimeMillis()) + "threadId:" + Thread.currentThread().getId());

    elementList.add(String.valueOf(System.currentTimeMillis()));
    return elementList;

  }

  public void removeElement() {
    System.out.println("remove element:" + elementList.get(elementList.size() - 1) + "threadId:" + Thread.currentThread().getName());
    elementList.remove(elementList.size() - 1);
  }

  public List<String> getElementList() {
    return elementList;
  }
}
