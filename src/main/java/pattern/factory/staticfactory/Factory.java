package pattern.factory.staticfactory;

import pattern.factory.Drawer;
import pattern.factory.Circle;
import pattern.factory.Square;

public class Factory {

  public static Drawer getCircleInstance() {
    return new Circle();
  }

  public static Drawer getSquareInstance() {
    return new Square();
  }

}
