package pattern.bridge.impl;

import pattern.bridge.Implementor;

public class ConcreateImplementorB implements Implementor {

  @Override
  public void operator() {
    System.out.println("this is the second operator impl");
  }
}
