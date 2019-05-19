package pattern.template;

public class TemplateTest {

  public static void main(String[] args) {
    AbstractClass abstractClass;
    abstractClass = new ConcreteClassA();
    abstractClass.operate();

    abstractClass = new ConcreteClassB();
    abstractClass.operate();
  }
}
