package pattern.behavior.responsibilitychain;

public class JavaHandler extends Handler {

  @Override
  public void handler(String flag) {
    if ("Java".equals(flag)) {
      System.out.println("I can Handle this request : " + this.getClass().getName() + flag);
    } else {
      if (getNextHandler() != null) {
        getNextHandler().handler(flag);
      } else {
        System.out.println("No handler can process this request in this responsibility chain");
      }
    }
  }
}
