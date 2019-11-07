package pattern.behavior.visitor.twoVisitor;

/**
 * 访问者接口
 */
public interface VisitorI {

  void visit(EngineerStaff engineerStaff);

  void visit(MangerStaff mangerStaff);
}
