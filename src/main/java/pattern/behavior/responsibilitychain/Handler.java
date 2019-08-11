package pattern.behavior.responsibilitychain;

public abstract class Handler {

  private Handler nextHandler;

  public void setNextHandler(Handler handler) {
    this.nextHandler = handler;
  }

  public Handler getNextHandler() {
    return this.nextHandler;
  }

  public abstract void handler(String flag);

}
