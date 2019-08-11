package pattern.behavior.interpret;

public class Test {

  static Express getMaleExpress() {
    //创建规则：Robert 和 John 是男性
    Express john = new TerminalExpress("John");
    Express robert = new TerminalExpress("Robert");
    return new OrExpress(john, robert);
  }

  static Express getMarriedFemale() {
    //创建规则：Fiona 是已婚女性
    Express fiona = new TerminalExpress("Fiona");
    Express married = new TerminalExpress("Married");
    return new AddExpress(fiona, married);
  }


  public static void main(String[] args) {
    Express isMaleExpress = getMaleExpress();
    Express isMarriedWomenExpress = getMarriedFemale();

    System.out.println("John is male ? " + isMaleExpress.interpret("John"));
    System.out.println("Fiona is married female ? " + isMarriedWomenExpress.interpret("Married Fiona"));
  }
}
