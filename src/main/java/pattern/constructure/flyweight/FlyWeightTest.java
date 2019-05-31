package pattern.constructure.flyweight;

public class FlyWeightTest {
  private static final String colors[] =
      { "Red", "Green", "Blue", "White", "Black" };
  public static void main(String[] args) {

    for(int i=0; i < 20; ++i) {
      Circle circle =
          (Circle)CircleFactory.getCircle(getRandomColor());
      circle.setX(getRandomX());
      circle.setY(getRandomY());
      circle.draw();
    }
  }
  private static String getRandomColor() {
    return colors[(int)(Math.random()*colors.length)];
  }
  private static Double getRandomX() {
    return (Double) (Math.random()*100 );
  }
  private static Double getRandomY() {
    return (Double)(Math.random()*100);
  }
}
