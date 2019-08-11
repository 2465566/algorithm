package aqs.condition;

public class ConditionTest {

  public static void main(String[] args) {
    Business business = new Business();

    Thread threadA = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          business.printA();
        }
      }
    });

    Thread threadB = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          business.printB();
        }
      }
    });

    Thread threadC = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          business.printC();
        }
      }
    });

    threadA.start();
    threadB.start();
    threadC.start();
  }
}

