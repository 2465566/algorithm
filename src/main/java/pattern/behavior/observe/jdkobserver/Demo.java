package pattern.behavior.observe.jdkobserver;

public class Demo {
  public static void main(String [] args) {
    Subject subject = new Subject();
    new FirstObserverImpl("first", subject);
    new SecondObserverImpl("second", subject);
    subject.setMessage("message");
  }
}
