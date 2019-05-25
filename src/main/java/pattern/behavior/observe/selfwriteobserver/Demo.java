package pattern.behavior.observe.selfwriteobserver;

import pattern.behavior.observe.selfwriteobserver.impl.FirstObserverImpl;
import pattern.behavior.observe.selfwriteobserver.impl.SecondObserverImpl;
import pattern.behavior.observe.selfwriteobserver.impl.ThirdObserverImpl;

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
