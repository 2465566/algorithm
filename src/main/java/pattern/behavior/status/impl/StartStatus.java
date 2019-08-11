package pattern.behavior.status.impl;

import pattern.behavior.status.Status;

public class StartStatus implements Status {

  @Override
  public void perform() {
    System.out.println("start handler");
  }
}
