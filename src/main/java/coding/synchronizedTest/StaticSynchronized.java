package coding.synchronizedTest;

public class StaticSynchronized {

  public static synchronized void getA() {
    System.out.println("current time A:" + System.currentTimeMillis());
    try {
      Thread.sleep(99999);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("name = " + Thread.currentThread().getName() + ", end");
  }


  public static void getB() {
    System.out.println("current time B:" + System.currentTimeMillis());
    System.out.println("name = " + Thread.currentThread().getName() + ", end");

  }

  public static void main(String[] args) {

    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        getA();
      }
    });


    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        getB();
      }
    });
    thread1.start();
    thread2.start();
    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
