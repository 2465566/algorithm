package pattern.behavior.visitor.oneVisitor;

/**
 * 具体元素实现了Accept方法，在Accept方法中调用访问者的访问方法以便完成一个元素的操作。
 */
public class JapanFactory implements CountryFactoryI {

  @Override
  public void accept(VisitorI visitorI) {
    visitorI.visit(this);
    this.operator();   //可以再main方法里手动调用
  }

  @Override
  public void operator() {
    System.out.println("感觉一般");
  }
}
