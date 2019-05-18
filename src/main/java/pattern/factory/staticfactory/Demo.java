package pattern.factory.staticfactory;

import pattern.factory.Drawer;

public class Demo {

  public static void main(String args[]) {
    Drawer circleDrawer = Factory.getCircleInstance();
    Drawer squareDrawer = Factory.getSquareInstance();
    circleDrawer.draw();
    squareDrawer.draw();

    /**
     * 此处静态工厂方法的缺点是要增加新的类型类型实例，需要修改工厂类增加新的类型，违反了闭包原则。
     * 抽象工厂模式为了解决这个问题，为不同的实例创建你同的工厂类，但是个人感觉这样增加了工厂类的个数。
     */
  }
}
