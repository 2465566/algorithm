package pattern.create.prototype;

import lombok.Data;

@Data
public class Resume implements Cloneable {

  private String name;
  private int age;
  private String company;

  public Resume clone() {
    Resume resume = null;
    try {
      resume = (Resume) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return resume;
  }
}
