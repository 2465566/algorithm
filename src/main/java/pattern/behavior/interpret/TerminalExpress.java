package pattern.behavior.interpret;

public class TerminalExpress implements Express {

  private String data;

  TerminalExpress(String data) {
    this.data = data;
  }

  @Override
  public boolean interpret(String context) {
    return context.contains(data);
  }
}
