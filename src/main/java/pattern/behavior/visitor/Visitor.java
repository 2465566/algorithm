package pattern.behavior.visitor;

/**
 * 具体访问者
 */
public class Visitor implements VisitorI {

  @Override
  public void visit(AmericaFactory americaFactory) {    //根据传入的类型是 AmericaFactory  还是 JapanFactory 来匹配要执行的方法
    System.out.println("访问美国");
  }

  @Override
  public void visit(JapanFactory japanFactory) {
    System.out.println("访问日本");
  }
}
