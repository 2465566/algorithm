package pattern.create.factory.abstractfactory;

import pattern.create.factory.Drawer;
import pattern.create.factory.Square;

public class SquareFactory {
 public static Drawer getSquareInstance() {
   return new Square();
 }
}
