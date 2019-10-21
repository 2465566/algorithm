package pattern.behavior.visitor;

import java.util.Random;

public class MangerStaff extends Staff {

  public MangerStaff(String name) {
    super(name);
  }

  @Override
  public void accept(VisitorI visitorI) {
    visitorI.visit(this);
  }

  public int getProducts() {
    return new Random().nextInt(10);
  }
}
