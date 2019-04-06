package mode.observe;

import com.google.common.collect.Lists;
import java.util.List;

public class Subject {

  private List<Observer> observerList = Lists.newArrayList();

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
    this.notifiedAll();
  }

  private int state;

  public void attach(Observer observer) {
    observerList.add(observer);
  }

  public void notifiedAll() {
    for (Observer observer : observerList) {
      observer.update();
    }
  }
}
