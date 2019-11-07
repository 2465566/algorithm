package thread.prodcerconusmer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadMultiTest {
  public static void main(String[] args) {
    final ElementBuffer buffer = ElementBuffer.getElementBuffer();
    ExecutorService addElementExecutorService = new ThreadPoolExecutor(5, 10, 20,
            TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));
    ExecutorService removeElementExecutorService = new ThreadPoolExecutor(5, 10, 20,
            TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));

    for (int i = 0; i < 20; i++) {
      addElementExecutorService.submit(new Runnable() {
        @Override
        public void run() {
          try {
            Thread.sleep(1000);
          } catch (Exception e) {
            e.printStackTrace();
          }
          buffer.addElement();
        }
      });

      removeElementExecutorService.submit(new Runnable() {
        @Override
        public void run() {
          try {
            Thread.sleep(1000);
          } catch (Exception e) {
            e.printStackTrace();
          }
          buffer.removeElement();
        }
      });
    }
  }
}
