package pattern.template;

public abstract class AbstractClass {

  public abstract void operate1();

  public abstract void operate2();

  public void operate() {
    operate1();
    operate2();
  }
}
