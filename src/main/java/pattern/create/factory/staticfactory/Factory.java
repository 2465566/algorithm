package pattern.create.factory.staticfactory;

import pattern.create.factory.Drawer;
import pattern.create.factory.Circle;
import pattern.create.factory.Square;

public class Factory {

  public static Drawer getCircleInstance() {
    return new Circle();
  }

  public static Drawer getSquareInstance() {
    return new Square();
  }

}
