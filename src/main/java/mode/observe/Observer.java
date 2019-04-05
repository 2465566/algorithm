package mode.observe;

public abstract class Observer {

  public abstract void update();

  protected Subject subject;
}
