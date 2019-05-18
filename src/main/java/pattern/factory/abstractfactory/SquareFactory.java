package pattern.factory.abstractfactory;

import pattern.factory.Drawer;
import pattern.factory.Square;

public class SquareFactory {
 public static Drawer getSquareInstance() {
   return new Square();
 }
}
