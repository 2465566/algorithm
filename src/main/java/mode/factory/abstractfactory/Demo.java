package mode.factory.abstractfactory;

import mode.factory.Drawer;

public class Demo {

  public static void main(String args[]) {
    Drawer circleDrawer = CircleFactory.getCirecleInstance();
    Drawer squareDrawer = SquareFactory.getSquareInstace();

    circleDrawer.draw();
    squareDrawer.draw();
  }
}
