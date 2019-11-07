package pattern.behavior.visitor.oneVisitor;

/**
 * 抽象元素，一般是一个抽象类或接口，定义一个Accept方法，该方法通常以一个抽象访问者作为参数。
 */
public interface CountryFactoryI {

  void accept(VisitorI visitorI);

  void operator(); //具体元素对象可以在此执行自己的逻辑
}
