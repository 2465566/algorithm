package pattern.constructure.bridge;

import pattern.constructure.bridge.impl.ConcreteImplementorA;
import pattern.constructure.bridge.impl.ConcreteImplementorB;

/**
 * 桥接模式把抽象(Abstraction)与行为实现(Implementation)分离开来，从而可以保持各部分的独立性以及应对他们的功能扩展。
 */
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

   //---------------------------------------------------

    Abstraction abstraction2 = new RefinedAbstraction2();   //应该是通过Abstraction 不是 RefinedAbstraction
    abstraction2.setOperator(new ConcreteImplementorA());
    abstraction2.getOperator().operator();
    abstraction2.operationAnother();
    abstraction2.setOperator(new ConcreteImplementorB());
    abstraction2.getOperator().operator();
    abstraction2.operationAnother();
  }
}
