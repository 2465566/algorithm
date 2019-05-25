package pattern.constructure.bridge;

public class RefinedAbstraction extends Abstraction {

  @Override
  public void operationAnother() {
    System.out.println("this is the impl of abstract method in Abstraction");
  }
}
