package pattern.observe.selfwriteobserver.impl;

import pattern.observe.selfwriteobserver.Observer;
import pattern.observe.selfwriteobserver.Subject;

public class SecondObserverImpl implements Observer {

  public SecondObserverImpl(Subject subject) {
    subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("this is the secondObserverImpl state: ");
  }
}
