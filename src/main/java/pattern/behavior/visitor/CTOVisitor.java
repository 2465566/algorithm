package pattern.behavior.visitor;

/**
 * 具体访问者
 */
public class CTOVisitor implements VisitorI {
  @Override
  public void visit(EngineerStaff engineerStaff) {
    System.out.println("CTO 考核：" + engineerStaff.name + " kpi: " + engineerStaff.kpi);
  }

  @Override
  public void visit(MangerStaff mangerStaff) {
    System.out.println("CTO 考核：" + mangerStaff.name + " kpi: " + mangerStaff.kpi);
  }
}
