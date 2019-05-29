package pattern.constructure.composite.lucency;

import com.google.common.collect.Lists;
import java.util.List;
import org.springframework.util.CollectionUtils;

public class Composite extends Component {

  private List<Component> componentList = Lists.newArrayList();

  private String name;

  public Composite(String name) {
    this.name = name;
  }

  public void addComponent(Component component) {
    componentList.add(component);
  }

  public void removeComponent(int index) {
    componentList.remove(index);
  }

  @Override
  public void printStr() {
    System.out.println("name: " + name);
    if (!CollectionUtils.isEmpty(componentList)) {
      componentList.forEach(Component::printStr);
    }
  }
}
