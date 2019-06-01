package pattern.constructure.decorator;

import lombok.Data;

@Data

//decorator
public class SuperCar implements ICar {

  private ICar iCar;

  public SuperCar(ICar iCar) {
    this.iCar = iCar;
  }

  @Override
  public void move() {
    iCar.move();
  }
}
