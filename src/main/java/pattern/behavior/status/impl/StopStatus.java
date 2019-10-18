package pattern.behavior.status.impl;

import pattern.behavior.status.Context;
import pattern.behavior.status.Status;

public class StopStatus implements Status {

  @Override
  public void perform(Context context) {
    System.out.println("Stop process");
    context.setStatus(new StartStatus());
  }
}
