package pattern.behavior.observe.selfwriteobserver;

import com.google.common.collect.Lists;
import java.util.List;

public class Observable {
  private List<Observer> observerList = Lists.newArrayList();

  public int getState() {
    return state;
  }

  public synchronized void setState(int state) {
    this.state = state;
    this.notifiedAll();
  }

  private int state;

  public synchronized void attach(Observer observer) {
    observerList.add(observer);
  }

  public synchronized void notifiedAll() {
    for (Observer observer : observerList) {
      observer.update(state);
    }
  }
}
