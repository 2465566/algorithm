package pattern.bridge.impl;

import pattern.bridge.Implementor;

public class ConcreateImplementorA implements Implementor {

  @Override
  public void operator() {
    System.out.println("this is the first operator impl");
  }
}
