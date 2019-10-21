package pattern.behavior.visitor;

/**
 * 具体访问者
 */
public class CEOVisitor implements VisitorI {
  @Override
  public void visit(EngineerStaff engineerStaff) {
    System.out.println("CEO 考核：代码行数：" + engineerStaff.getCodeLine() + " kpi：" + engineerStaff.kpi);
  }

  @Override
  public void visit(MangerStaff mangerStaff) {
    System.out.println("CEO 考核：产品数量：" + mangerStaff.getProducts() + " kpi：" + mangerStaff.kpi);
  }
}
