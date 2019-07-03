package pattern.behavior.visitor;

/**
 * 抽象元素，一般是一个抽象类或接口，定义一个Accept方法，该方法通常以一个抽象访问者作为参数。
 */
public interface CountryFactoryI {

  void accept(VisitorI visitorI);
}
