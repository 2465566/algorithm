package pattern.factory;

public class Square implements Drawer {

  @Override
  public void draw() {
    System.out.println("square drawing");
  }
}
