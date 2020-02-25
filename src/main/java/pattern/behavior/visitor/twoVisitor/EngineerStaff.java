package pattern.behavior.visitor.twoVisitor;

import java.util.Random;

public class EngineerStaff extends Staff {

  public EngineerStaff(String name) {
    super(name);
  }

  //接受访问者的访问，并进行访问者的访问行为
  @Override
  public void accept(VisitorI visitorI) {
    visitorI.visit(this);
  }

  public int getCodeLine() {
    return new Random().nextInt(10);
  }
}
