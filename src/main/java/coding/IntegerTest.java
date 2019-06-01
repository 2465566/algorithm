package coding;

public class IntegerTest {


  public static void main(String[] args) {
    Integer i1 = 1;
    Integer i2 = 1;
    Integer i3 = new Integer(1);
    Integer i4 = 129;
    Integer i5 = 129;

    System.out.println("i1.equals(i2) " + i1.equals(i2));
    if (i1 == i2) {
      System.out.println("i1 == i2");
    } else {
      System.out.println("i1 != i2");
    }

    System.out.println("i1.equals(i3) " + i1.equals(i3));
    if (i1 == i3) {
      System.out.println("i1 == i3");
    } else {
      System.out.println("i1 != i3");
    }

    System.out.println("i4.equals(i5) " + i4.equals(i5));
    if (i1 == i3) {
      System.out.println("i4 == i5");
    } else {
      System.out.println("i4 != i5");
    }

  }
}
