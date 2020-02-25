package pattern.constructure.decorator;

/**
 * 需要被装饰的原始对象，被装饰者必须实现接口
 */
public class Car implements ICar {

  @Override
  public void move() {
    System.out.println("路上驾驶");
  }
}
