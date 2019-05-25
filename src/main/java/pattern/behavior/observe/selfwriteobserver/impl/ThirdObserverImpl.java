package pattern.behavior.observe.selfwriteobserver.impl;

import pattern.behavior.observe.selfwriteobserver.Observer;
import pattern.behavior.observe.selfwriteobserver.Subject;

public class ThirdObserverImpl implements Observer {

  public ThirdObserverImpl(Subject subject) {
    subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("this is the thirdObserverImpl state: ");
  }
}
