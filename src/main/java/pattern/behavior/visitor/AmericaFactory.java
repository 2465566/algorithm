package pattern.behavior.visitor;

/**
 * 具体元素实现了Accept方法，在Accept方法中调用访问者的访问方法以便完成一个元素的操作。
 */
public class AmericaFactory implements CountryFactoryI {

  @Override
  public void accept(VisitorI visitorI) {
    visitorI.visit(this);
  }
}
