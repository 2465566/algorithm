package pattern.create.builder.impl;

import pattern.create.builder.Builder;
import pattern.create.builder.Product;

public class ConcreteBuilderB implements Builder {
  private Product product = new Product();     // 构建者模式聚合的特点，非接口。

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
