package pattern.create.factory.abstractfactory;

import pattern.create.factory.Drawer;

public class Demo {

  public static void main(String args[]) {
    Drawer circleDrawer = CircleFactory.getCircleInstance();
    Drawer squareDrawer = SquareFactory.getSquareInstance();

    circleDrawer.draw();
    squareDrawer.draw();
  }
}
