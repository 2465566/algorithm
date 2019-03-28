package algorithm.thread;

public class ThreadProducerTest {
  public static void main(String[] args) {
    for (int i=0; i< 10; i++) {
      ThreadProducer producer = new ThreadProducer();
      ThreadConsumer consumer = new ThreadConsumer();
      producer.start();
      consumer.start();
    }
  }
}
