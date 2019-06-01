package pattern.constructure.decorator;

public class DecoratorTest {

  public static void main(String[] args) {
    Car car = new Car();
    car.move();

    System.out.println("增加新的功能：自动驾驶");
    AutomaticCar automaticCar = new AutomaticCar(car);
    automaticCar.move();

    System.out.println("增加新的功能：天上飞");
    FlySuperCar flySuperCar = new FlySuperCar(car);
    flySuperCar.move();
  }

}
