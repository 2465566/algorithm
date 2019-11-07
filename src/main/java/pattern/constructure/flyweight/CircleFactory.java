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
      System.out.println("get circle of color : " + color);
      return circle;
    } else {
      Circle circle = new Circle(color);
      circleMap.put(color, circle);
      System.out.println("Creating circle of color : " + color);
      return circle;
    }
  }
}
