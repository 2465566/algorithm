package pattern.behavior.observe.jdkobserver;

import java.util.Observable;
import java.util.Observer;

public class SecondObserverImpl implements Observer {

  private String name;

  SecondObserverImpl(String name, Subject subject) {
    this.name = name;
    subject.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    String msg = ((Subject) o).getMessage();
    System.out.println(name + " this is the SecondObserverImpl logging: " + msg);
  }
}
