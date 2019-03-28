package algorithm.thread;

public class ThreadProducer extends Thread {

  private ThreadBuffer buffer = null;

  @Override
  public void run() {
    if (null == buffer) {
      buffer = ThreadBuffer.getThreadBuffer();
    }
    if (buffer.getElementList().size() > 10) {
      try {
        synchronized (buffer) {
          buffer.wait();
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
     synchronized (buffer) {
      buffer.addElement();
      buffer.notifyAll();
     }
  }
}

