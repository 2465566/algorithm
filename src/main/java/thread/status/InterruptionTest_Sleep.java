package thread.status;

public class InterruptionTest_Sleep {

  public static void main(String[] args) throws InterruptedException {

    Thread sleepThread = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          Thread.sleep(10000000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        while (true) {
          if (Thread.currentThread().isInterrupted()) {     //被打断线程会继续执行，但是如果调用sleep,wait,join 会抛异常
            System.out.println("Interrupted, but thread still running");
            return;  //  线程被中断后，可以在代码里面自己检测，然后做相应处理 比如 return。
          } else {
            System.out.println("not Interrupted");          //没被打断
          }
        }
      }
    });

    thread.start();
    Thread.sleep(1000);
    thread.interrupt();
    System.out.println("main end");
    sleepThread.start();
    sleepThread.interrupt();
  }
}



