package pattern.behavior.status.impl;

import pattern.behavior.status.Status;

public class StopStatus implements Status {

  @Override
  public void perform() {
    System.out.println("Stop process");
  }
}
