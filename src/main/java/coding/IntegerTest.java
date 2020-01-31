package coding;

public class IntegerTest {


  public static void main(String[] args) {
    Integer i1 = 1;
    Integer i2 = 1;
    Integer i3 = new Integer(1);  //常量池和对象地址肯定不一样
    Integer i4 = 129;  // 超过127 不走常量池，是两个对象
    Integer i5 = 129;

    System.out.println("i1.equals(i2) " + i1.equals(i2));
    if (i1 == i2) {   // i1,i2 实际上指向常量池同一地址
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
