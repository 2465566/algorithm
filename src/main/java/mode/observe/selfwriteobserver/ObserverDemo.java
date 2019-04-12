package mode.observe.selfwriteobserver;

import mode.observe.selfwriteobserver.impl.FirstObserverImpl;
import mode.observe.selfwriteobserver.impl.SecondObserverImpl;
import mode.observe.selfwriteobserver.impl.ThirdObserverImpl;

public class ObserverDemo {
  public static void main(String args[]) {
    Subject subject = new Subject();

    new FirstObserverImpl(subject);
    new SecondObserverImpl(subject);
    new ThirdObserverImpl(subject);

    subject.setState(10);
    subject.setState(20);
  }

}
