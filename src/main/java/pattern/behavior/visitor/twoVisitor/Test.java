package pattern.behavior.visitor.twoVisitor;

public class Test {

  public static void main(String[] args) {

    VisitorI visitorI = new CEOVisitor();
    Staff staff1 = new EngineerStaff("工程师1");
    Staff staff12 = new MangerStaff("产品经理1");
    staff1.accept(visitorI);
    staff12.accept(visitorI);

    VisitorI visitorI1 = new CTOVisitor();
    Staff staff11 = new EngineerStaff("工程师1");
    Staff staff121 = new MangerStaff("工程师2");
    staff11.accept(visitorI1);
    staff121.accept(visitorI1);
  }
}
