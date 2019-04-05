package mode.observe;

import mode.observe.impl.FirstObserverImpl;
import mode.observe.impl.SecondObserverImpl;
import mode.observe.impl.ThridObserverImpl;

public class ObserverDemo {
  public static void main(String args[]) {
    Subject subject = new Subject();

    new FirstObserverImpl(subject);
    new SecondObserverImpl(subject);
    new ThridObserverImpl(subject);

    subject.setState(10);
    subject.setState(20);
  }

}
