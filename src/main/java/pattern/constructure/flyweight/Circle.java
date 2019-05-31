package pattern.constructure.flyweight;

import lombok.Data;

@Data
public class Circle implements Drawer {

  private Double x;
  private Double y;
  private Double radius;
  private String color;

  Circle(String color) {
    this.color = color;
  }

  @Override
  public void draw() {
    System.out.println("this is the " + color + " circle drawing");
  }
}
