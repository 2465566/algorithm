package pattern.constructure.bridge.impl;

import pattern.constructure.bridge.Implementor;

public class ConcreateImplementorB implements Implementor {

  @Override
  public void operator() {
    System.out.println("this is the second operator impl");
  }
}
