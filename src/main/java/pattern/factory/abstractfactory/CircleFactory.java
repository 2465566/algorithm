package pattern.factory.abstractfactory;

import pattern.factory.Circle;
import pattern.factory.Drawer;

public class CircleFactory {
 public static Drawer getCircleInstance() {
   return new Circle();
 }
}
