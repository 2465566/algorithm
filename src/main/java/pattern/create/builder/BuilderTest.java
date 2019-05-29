package pattern.create.builder;

import pattern.create.builder.impl.ConcreteBuilderA;
import pattern.create.builder.impl.ConcreteBuilderB;

public class BuilderTest {

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
