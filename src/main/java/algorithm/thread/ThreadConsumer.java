package algorithm.thread;

import org.springframework.util.CollectionUtils;

public class ThreadConsumer extends Thread {

  private ThreadBuffer buffer = null;

  @Override
  public void run() {
    synchronized (this) {
      if (null == buffer) {
        buffer = ThreadBuffer.getThreadBuffer();
      }
      if (CollectionUtils.isEmpty(buffer.getElementList())) {
        try {
          buffer.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      buffer.removeElement();
      buffer.notify();
    }
  }
}

