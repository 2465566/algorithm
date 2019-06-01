package coding;

public class StringCacheTest {

  public static void main(String[] args) {
    String s1 = "ss";
    String s2 = "ss";
    String s3 = String.valueOf("ss");
    String s4 = new String("ss");

    System.out.println("s1.equals(s2) " + s1.equals(s2));
     if (s1 == s2) {
       System.out.println("s1 == s2 ");
     } else {
       System.out.println("s1 != s2 ");
     }

    if (s1 == s3) {
      System.out.println("s1 == s3 ");
    } else {
      System.out.println("s1 != s3 ");
    }

    if (s1 == s4) {
      System.out.println("s1 == s4 ");
    } else {
      System.out.println("s1 != s4 ");
    }
  }

}
