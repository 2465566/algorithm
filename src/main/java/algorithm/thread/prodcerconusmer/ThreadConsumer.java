package algorithm.thread.prodcerconusmer;

import algorithm.thread.prodcerconusmer.ElementBuffer;

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


