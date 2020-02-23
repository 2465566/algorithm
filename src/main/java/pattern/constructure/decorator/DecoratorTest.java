package pattern.constructure.decorator;

public class DecoratorTest {

  public static void main(String[] args) {
    Car car = new Car();
    car.move();

    System.out.println("先增加新的功能：自动驾驶");
    AutomaticCar automaticCar = new AutomaticCar(car);
    automaticCar.move();

    // 可以对一个对象进行多次装饰，创造出不同行为的组合，得到功能更加强大的对象
    System.out.println("再增加新的功能：天上飞");
    FlySuperCar flySuperCar = new FlySuperCar(automaticCar);
    flySuperCar.move();
  }
}
