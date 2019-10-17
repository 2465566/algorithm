package pattern.constructure.composite.lucency;

import java.util.List;

public abstract class Component {

  /**
   * 下面的三个方法，去掉就是安全式，加上就是透明式
   * @param component
   */
  public void addComponent(Component component) {
    throw new UnsupportedOperationException("对象不支持此功能");
  }

  public void removeComponent(int index) {
    throw new UnsupportedOperationException("对象不支持此功能");
  }

  public List<Component> getComponentList() {
    throw new UnsupportedOperationException("对象不支持此功能");
  }
  public abstract void printStr();
}
