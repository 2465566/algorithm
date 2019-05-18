package pattern.bridge;

public class RefinedAbstraction extends Abstraction {

  @Override
  public void operation() {
    super.getOperator().operator();
  }
}
