package pattern.behavior.status.impl;

import pattern.behavior.status.Context;
import pattern.behavior.status.Status;

public class StartStatus implements Status {

  @Override
  public void perform(Context context) {
    System.out.println("start handler");
    context.setStatus(new StopStatus());
  }
}
