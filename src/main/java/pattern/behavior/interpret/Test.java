package pattern.behavior.interpret;

public class Test {

  //创建规则：Robert 和 John 是男性, 可以解释两个人的性别
  static Express getMaleExpress() {
    Express johnExpress = new TerminalExpress("John");
    Express robertExpress = new TerminalExpress("Robert");
    return new OrExpress(johnExpress, robertExpress);
  }

  //创建规则：Fiona 是已婚女性，用来解释Fiona的性别和婚姻
  static Express getMarriedFemale() {
    Express fionaExpress = new TerminalExpress("Fiona");
    Express marriedExpress = new TerminalExpress("Married");
    return new AddExpress(fionaExpress, marriedExpress);
  }

  public static void main(String[] args) {
    Express isMaleExpress = getMaleExpress();
    Express isMarriedWomenExpress = getMarriedFemale();

    System.out.println("John is male ? " + isMaleExpress.interpret("John"));
    System.out.println("Fiona is married female ? " + isMarriedWomenExpress.interpret("Married Fiona"));
  }
}
