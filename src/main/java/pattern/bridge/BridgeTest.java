package pattern.bridge;

import pattern.bridge.impl.ConcreateImplementorA;
import pattern.bridge.impl.ConcreateImplementorB;

public class BridgeTest {

  public static void main(String[] args) {

    /**
     * 通过对Abstraction桥接类的调用，实现了对接口Implementor的实现类
     * ConcreteImplementorA和ConcreteImplementorB的调用, 实现了抽象与行为实现的分离。
     */
//    RefinedAbstraction abstraction = new RefinedAbstraction();
    Abstraction abstraction = new RefinedAbstraction();   //应该是通过Abstraction 不是 RefinedAbstraction

    abstraction.setOperator(new ConcreateImplementorA());
    abstraction.getOperator().operator();

    abstraction.setOperator(new ConcreateImplementorB());
    abstraction.getOperator().operator();
  }
}
