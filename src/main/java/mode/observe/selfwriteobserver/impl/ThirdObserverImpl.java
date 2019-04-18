package mode.observe.selfwriteobserver.impl;

import mode.observe.selfwriteobserver.Observer;
import mode.observe.selfwriteobserver.Subject;

public class ThirdObserverImpl implements Observer {

  public ThirdObserverImpl(Subject subject) {
    subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("this is the thirdObserverImpl state: ");
  }
}
