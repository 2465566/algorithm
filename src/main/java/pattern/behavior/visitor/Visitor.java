package pattern.behavior.visitor;

/**
 * 具体访问者
 */
public class Visitor implements VisitorI {

  @Override
  public void visit(AmericaFactory americaFactory) {
    System.out.println("访问美国");
  }

  @Override
  public void visit(JapanFactory japanFactory) {
    System.out.println("访问日本");
  }
}
