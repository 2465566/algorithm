package pattern.behavior.observe.selfwriteobserver.impl;

import pattern.behavior.observe.selfwriteobserver.Observer;
import pattern.behavior.observe.selfwriteobserver.Subject;

public class FirstObserverImpl implements Observer {

  public FirstObserverImpl(Subject subject) {
    subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("this is the firstObserverImpl state: ");
  }
}
