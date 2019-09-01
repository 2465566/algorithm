package pattern.behavior.template;

public abstract class AbstractClass {

  public abstract void operate1();

  public abstract void operate2();

  public void operate0() {
    System.out.println("this is operate0");
  }

  public void operate() {  //此方法，不应该被子类覆盖，作为子类集中调用以上抽象方法的入口某。
    operate0();
    operate1();
    operate2();
  }
}
