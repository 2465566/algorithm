package coding;

import lombok.Data;

@Data
public class StaticVO {

  public int value = 123;
  public static int value2 = 123;
  public static final int value3 = 123;

}
