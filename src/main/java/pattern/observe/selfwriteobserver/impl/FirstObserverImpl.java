package pattern.observe.selfwriteobserver.impl;

import pattern.observe.selfwriteobserver.Observer;
import pattern.observe.selfwriteobserver.Subject;

public class FirstObserverImpl implements Observer {

  public FirstObserverImpl(Subject subject) {
    subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("this is the firstObserverImpl state: ");
  }
}
