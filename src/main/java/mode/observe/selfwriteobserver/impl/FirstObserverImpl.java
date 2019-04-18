package mode.observe.selfwriteobserver.impl;

import mode.observe.selfwriteobserver.Observer;
import mode.observe.selfwriteobserver.Subject;

public class FirstObserverImpl implements Observer {

  public FirstObserverImpl(Subject subject) {
    subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("this is the firstObserverImpl state: ");
  }
}
