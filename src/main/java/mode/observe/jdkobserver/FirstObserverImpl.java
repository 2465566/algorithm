package mode.observe.jdkobserver;

import java.util.Observable;
import java.util.Observer;

public class FirstObserverImpl implements Observer {

  private String name;

  FirstObserverImpl(String name, Subject subject) {
    this.name = name;
    subject.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    String msg = ((Subject) o).getMessage();
    System.out.println("追车员" + name + "接收到报警信息：" + msg);
  }
}
