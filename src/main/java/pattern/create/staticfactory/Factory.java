package pattern.create.staticfactory;

public class Factory {

  public static Drawer getCircleInstance() {
    return new Circle();
  }

  public static Drawer getSquareInstance() {
    return new Square();
  }

}
