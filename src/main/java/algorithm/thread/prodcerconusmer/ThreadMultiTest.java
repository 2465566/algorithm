package algorithm.thread.prodcerconusmer;

public class ThreadMultiTest {

  public static void main(String[] args) {

    ElementBuffer buffer = ElementBuffer.getElementBuffer();

    ThreadProducer producer1 = new ThreadProducer(buffer);
    ThreadProducer producer2 = new ThreadProducer(buffer);
    ThreadProducer producer3 = new ThreadProducer(buffer);
    ThreadProducer producer4 = new ThreadProducer(buffer);
    ThreadProducer producer5 = new ThreadProducer(buffer);
    ThreadConsumer consumer1 = new ThreadConsumer(buffer);
    ThreadConsumer consumer2 = new ThreadConsumer(buffer);
    ThreadConsumer consumer3 = new ThreadConsumer(buffer);
    ThreadConsumer consumer4 = new ThreadConsumer(buffer);
    ThreadConsumer consumer5 = new ThreadConsumer(buffer);

    consumer1.start();
    consumer2.start();
    consumer3.start();
    consumer4.start();
    consumer5.start();
    producer1.start();
    producer2.start();
    producer3.start();
    producer4.start();
    producer5.start();

  }
}
