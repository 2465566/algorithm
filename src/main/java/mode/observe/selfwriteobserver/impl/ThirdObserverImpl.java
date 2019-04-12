package mode.observe.selfwriteobserver.impl;

import mode.observe.selfwriteobserver.Observer;
import mode.observe.selfwriteobserver.Subject;

public class ThirdObserverImpl extends Observer {

  public ThirdObserverImpl(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("this is the thirdObserverImpl state: " + subject.getState());
  }
}
