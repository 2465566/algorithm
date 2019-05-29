package pattern.constructure.composite.safe;

import com.google.common.collect.Lists;
import java.util.List;
import lombok.Data;
import org.springframework.util.CollectionUtils;

@Data
public class Composite implements Component {

  private List<Component> componentList = Lists.newArrayList();

  private String name;

  public Composite(String name) {
    this.name = name;
  }

  void addComponent(Component component) {
    componentList.add(component);
  }

  void removeComponent(int index) {
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
