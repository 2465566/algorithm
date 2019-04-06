package mode.factory.abstractfactory;

import mode.factory.Circle;
import mode.factory.Drawer;

public class CircleFactory {
 public static Drawer getCirecleInstance() {
   return new Circle();
 }
}
