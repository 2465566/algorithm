package pattern.behavior.observe.selfwriteobserver.impl;

import pattern.behavior.observe.selfwriteobserver.Observer;
import pattern.behavior.observe.selfwriteobserver.Subject;

public class SecondObserverImpl implements Observer {

  public SecondObserverImpl(Subject subject) {
    subject.attach(this);
  }

  @Override
  public void update(int state) {
    System.out.println("this is the secondObserverImpl state: " + state);
  }
}
