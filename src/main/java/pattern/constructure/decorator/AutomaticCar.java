package pattern.constructure.decorator;

public class AutomaticCar extends SuperCar {

  public AutomaticCar(ICar iCar) {
    super(iCar);
  }

  private void automaticDrive() {
    System.out.println("自动驾驶");
  }

  @Override
  public void move() {
    super.move();
    automaticDrive();
  }
}
