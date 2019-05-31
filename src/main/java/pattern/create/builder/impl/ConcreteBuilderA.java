package pattern.create.builder.impl;

import pattern.create.builder.Builder;
import pattern.create.builder.Product;

public class ConcreteBuilderA implements Builder {
  private Product product = new Product();     // 关联

  @Override
  public void buildColor() {
    product.setColor("color A");
  }

  @Override
  public void buildBrand() {
    product.setBrand("branch A");
  }

  @Override
  public String getResult() {
    return product.toString();
  }
}
