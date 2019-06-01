package pattern.constructure.bridge.impl;

import pattern.constructure.bridge.Implementor;

public class ConcreteImplementorA implements Implementor {

  @Override
  public void operator() {
    System.out.println("this is the first operator impl");
  }
}
