package pattern.behavior.responsibilitychain;

public class PythonHandler extends Handler {

  @Override
  public void handler(String flag) {
    if ("Python".equals(flag)) {
      System.out.println("I can Handle this request: " + this.getClass().getName() + flag);
    } else {
      if (getNextHandler() != null) {
        getNextHandler().handler(flag);
      } else {
        System.out.println(
            "No handler can process this request:" + flag + "in this responsibility chain");
      }
    }
  }
}
