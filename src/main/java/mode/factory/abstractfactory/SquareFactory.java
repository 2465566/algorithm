package mode.factory.abstractfactory;

import mode.factory.Drawer;
import mode.factory.Square;

public class SquareFactory {
 public static Drawer getSquareInstace() {
   return new Square();
 }
}
