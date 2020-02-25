package pattern.behavior.interpret;

public class AddExpress implements Express {

  private Express expr1;
  private Express expr2;

  AddExpress(Express expr1, Express expr2) {
    this.expr1 = expr1;
    this.expr2 = expr2;
  }

  @Override
  public boolean interpret(String context) {
    return expr1.interpret(context) && expr2.interpret(context);
  }
}
