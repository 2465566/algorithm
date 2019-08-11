package pattern.behavior.status;

public class Context {
  private Status status;

  public void setStatus(Status status) {
    this.status = status;
  }

  public void perform() {
    this.status.perform();
  }

}
