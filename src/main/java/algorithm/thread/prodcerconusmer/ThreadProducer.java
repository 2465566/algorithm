package algorithm.thread.prodcerconusmer;

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


