package mode.factory.staticfactory;

import mode.factory.Drawer;
import mode.factory.Circle;
import mode.factory.Square;

public class Factory {

  public static Drawer getCircleInstance() {
    return new Circle();
  }

  public static Drawer getSquareInstance() {
    return new Square();
  }

}
