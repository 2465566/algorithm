package pattern.create.builder;

import pattern.create.builder.impl.ConcreteBuilderA;
import pattern.create.builder.impl.ConcreteBuilderB;

public class BuilderTest {

  /**
   *  将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
   * @param args
   */
  public static void main(String[] args) {

    ConcreteBuilderA concreteBuilderA = new ConcreteBuilderA();
    ConcreteBuilderB concreteBuilderB = new ConcreteBuilderB();
    Director director = new Director(concreteBuilderA);
    director.construct();
    director.getResult();

    Director director2 = new Director(concreteBuilderB);
    director2.construct();
    director2.getResult();
  }
}
