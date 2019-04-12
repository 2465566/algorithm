package mode.observe.selfwriteobserver.impl;

import mode.observe.selfwriteobserver.Observer;
import mode.observe.selfwriteobserver.Subject;

public class SecondObserverImpl extends Observer {

  public SecondObserverImpl(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("this is the secondObserverImpl state: " + subject.getState());
  }
}
