package pattern.constructure.flyweight;

import com.google.common.collect.Maps;
import java.util.Map;
import lombok.Data;

@Data
public class CircleFactory {

  private static Map<String, Circle> circleMap = Maps.newHashMap();

  public static Drawer getCircle(String color) {
    if (circleMap.get(color) != null) {
      Circle circle = circleMap.get(color);
      circle.setX(1d);
      circle.setY(1D);
      System.out.println("get circle of color : " + color);
      return circle;
    } else {
      Circle circle = new Circle(color);
      circle.setX(1D);
      circle.setY(1D);
      circleMap.put(color, circle);
      System.out.println("Creating circle of color : " + color);
      return circle;
    }
  }
}
