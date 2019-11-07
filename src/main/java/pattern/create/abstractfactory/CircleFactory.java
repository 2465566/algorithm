package pattern.create.abstractfactory;

public class CircleFactory {
 public static Drawer getCircleInstance() {
   return new Circle();
 }
}
