package pattern.constructure.bridge.impl;

import pattern.constructure.bridge.Implementor;

public class ConcreateImplementorA implements Implementor {

  @Override
  public void operator() {
    System.out.println("this is the first operator impl");
  }
}
