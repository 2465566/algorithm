package mode.observe.selfwriteobserver.impl;

import mode.observe.selfwriteobserver.Observer;
import mode.observe.selfwriteobserver.Subject;

public class FirstObserverImpl extends Observer {

  public FirstObserverImpl(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);  // this，@Override了方法的当前对象
  }

  @Override
  public void update() {
    System.out.println("this is the firstObserverImpl state: " + subject.getState());
  }
}
