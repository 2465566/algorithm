package pattern.create.builder;

import pattern.create.builder.impl.ConcreteBuilderA;
import pattern.create.builder.impl.ConcreteBuilderB;

public class BuilderTest {

  /**
   *  将一个复杂对象的构建与表示分离，使得同样的构建过程可以创建不同的表示。
   * @param args
   */
  public static void main(String[] args) {

    ConcreteBuilderA concreteBuilderA = new ConcreteBuilderA();   // 对象表示特征
    ConcreteBuilderB concreteBuilderB = new ConcreteBuilderB();   // 对象表示特征
    Director director = new Director(concreteBuilderA);    // 对象构造的通用过程
    director.construct();
    director.getResult();

    Director director2 = new Director(concreteBuilderB);
    director2.construct();
    director2.getResult();
  }
}
