package pattern.constructure.composite.lucency;

import java.util.List;

public abstract class Component {

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
