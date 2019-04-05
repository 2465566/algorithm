package mode.observe.impl;

import mode.observe.Observer;
import mode.observe.Subject;

public class ThridObserverImpl extends Observer {

  public ThridObserverImpl(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("this is the thirdObserverImpl logging");
  }
}
