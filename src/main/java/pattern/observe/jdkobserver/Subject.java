package pattern.observe.jdkobserver;

import java.util.Observable;

/**
 * 目标对象
 */
public class Subject extends Observable {   //jdk 封装了Observable，所以subject 只需要继承，不需要自己维护观察者的信息和操作。

  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
    setChanged();
    notifyObservers();
  }

  @Override
  protected synchronized void setChanged() {
    super.setChanged();
  }
}
