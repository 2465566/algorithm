package mode.observe.impl;

import mode.observe.Observer;
import mode.observe.Subject;

public class FirstObserverImpl extends Observer {

  public FirstObserverImpl(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("this is the firstObserverImpl logging");
  }
}
