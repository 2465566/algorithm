package algorithm.thread.prodcerconusmer;

import algorithm.thread.prodcerconusmer.ElementBuffer;

public class ThreadProducer extends Thread {

  ElementBuffer buffer = null;

  ThreadProducer(ElementBuffer buffer) {
    this.buffer = buffer;
  }

  @Override
  public void run() {
    buffer.addElement();
  }
}


