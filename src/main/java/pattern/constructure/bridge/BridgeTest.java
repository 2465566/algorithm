package pattern.constructure.bridge;

import pattern.constructure.bridge.impl.ConcreteImplementorA;
import pattern.constructure.bridge.impl.ConcreteImplementorB;

public class BridgeTest {

  public static void main(String[] args) {

    /**
     * 通过对Abstraction桥接类的调用，实现了对接口Implementor的实现类
     * ConcreteImplementorA和ConcreteImplementorB的调用, 实现了抽象与行为实现的分离。
     */

    Abstraction abstraction = new RefinedAbstraction();   //应该是通过Abstraction 不是 RefinedAbstraction

    abstraction.setOperator(new ConcreteImplementorA());
    abstraction.getOperator().operator();
    abstraction.operationAnother();

    abstraction.setOperator(new ConcreteImplementorB());
    abstraction.getOperator().operator();
    abstraction.operationAnother();
  }
}
