package pattern.create.factory;

public class Circle implements Drawer {

  @Override
  public void draw() {
    System.out.println("circle drawing");
  }
}
