package pattern.constructure.composite.safe;

public class Leaf implements Component {

  public Leaf(String name) {
    this.name = name;
  }

  private String name;

  @Override
  public void printStr() {
    System.out.println("name: " + name);

  }
}
