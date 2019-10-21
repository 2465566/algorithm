package pattern.behavior.visitor0.visitor;

public class Test {

  public static void main(String[] args) {
    VisitorI visitorI = new Visitor();
    CountryFactoryI countryFactoryI1 = new AmericaFactory();
    countryFactoryI1.accept(visitorI);
    CountryFactoryI countryFactoryI12 = new JapanFactory();
    countryFactoryI12.accept(visitorI);
  }
}
