package pattern.create.builder.impl;

import pattern.create.builder.Builder;
import pattern.create.builder.Product;

public class ConcreteBuilderB implements Builder {
  private Product product = new Product();     // 关联

  @Override
  public void buildColor() {
    product.setBranch("color B");
  }

  @Override
  public void buildBrand() {
    product.setColor("branch B");
  }

  @Override
  public String getResult() {
    return product.toString();
  }
}
