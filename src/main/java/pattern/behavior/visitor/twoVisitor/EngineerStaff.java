package pattern.behavior.visitor.twoVisitor;

import java.util.Random;

public class EngineerStaff extends Staff {

  public EngineerStaff(String name) {
    super(name);
  }

  @Override
  public void accept(VisitorI visitorI) {
    visitorI.visit(this);
  }

  public int getCodeLine() {
    return new Random().nextInt(10);
  }
}
