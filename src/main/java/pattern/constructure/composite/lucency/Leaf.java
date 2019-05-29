package pattern.constructure.composite.lucency;

public class Leaf extends Component {

  private String name;

  public Leaf(String name) {
    this.name = name;
  }

  @Override
  public void printStr() {
    System.out.println("name: " + name);
  }
}
