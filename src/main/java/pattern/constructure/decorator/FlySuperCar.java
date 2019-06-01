package pattern.constructure.decorator;

public class FlySuperCar extends SuperCar {

  public FlySuperCar(ICar iCar) {
    super(iCar);
  }

  private void fly() {
    System.out.println("天上飞");
  }

  @Override
  public void move() {
    super.move();
    fly();
  }

}
