package pattern.observe.selfwriteobserver;

import pattern.observe.selfwriteobserver.impl.FirstObserverImpl;
import pattern.observe.selfwriteobserver.impl.SecondObserverImpl;
import pattern.observe.selfwriteobserver.impl.ThirdObserverImpl;

public class Demo {
  public static void main(String args[]) {
    Subject subject = new Subject();

    new FirstObserverImpl(subject);
    new SecondObserverImpl(subject);
    new ThirdObserverImpl(subject);

    subject.setState(10);
    subject.setState(20);
  }
}
