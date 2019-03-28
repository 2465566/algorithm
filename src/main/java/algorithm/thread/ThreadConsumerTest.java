package algorithm.thread;

public class ThreadConsumerTest {
  public static void main(String[] args) {
    for (int i=0; i< 10; i++) {
      ThreadConsumer consumer = new ThreadConsumer();
      consumer.run();
    }
  }
}
