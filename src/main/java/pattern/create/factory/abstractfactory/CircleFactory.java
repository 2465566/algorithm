package pattern.create.factory.abstractfactory;

import pattern.create.factory.Circle;
import pattern.create.factory.Drawer;

public class CircleFactory {
 public static Drawer getCircleInstance() {
   return new Circle();
 }
}
