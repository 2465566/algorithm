package algorithm.thread;

public class ThreadConsumer extends Thread {

  ElementBuffer buffer = null;

  ThreadConsumer(ElementBuffer buffer) {
    this.buffer = buffer;
  }

  @Override
  public void run() {
    buffer.removeElement();
  }
}


