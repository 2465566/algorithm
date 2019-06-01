package pattern.constructure.bridge.impl;

import pattern.constructure.bridge.Implementor;

public class ConcreteImplementorB implements Implementor {

  @Override
  public void operator() {
    System.out.println("this is the second operator impl");
  }
}
