package pattern.create.builder;

import lombok.Data;

@Data
public class Director {

  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.buildBrand();
    builder.buildColor();
  }

  public void getResult() {
//    return this.builder.getResult();
    System.out.println("result" + this.builder.getResult());
  }

}
