package pattern.behavior.visitor;

/**
 * 访问者接口
 */
public interface VisitorI {

  void visit(AmericaFactory americaFactory);

  void visit(JapanFactory japanFactory);
}
