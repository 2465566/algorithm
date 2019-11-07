package pattern.create.abstractfactory;


public class SquareFactory {
 public static Drawer getSquareInstance() {
   return new Square();
 }
}
