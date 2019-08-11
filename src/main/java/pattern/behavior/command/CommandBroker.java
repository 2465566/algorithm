package pattern.behavior.command;

import com.google.common.collect.Lists;
import java.util.List;

public class CommandBroker {

  private List<Command> commandList = Lists.newArrayList();

  public void addOrder(Command command) {
    commandList.add(command);
  }

  public void placeOrder() {
    commandList.forEach(Command::execute);
    clearBroker();
  }

  public void clearBroker() {
    commandList.clear();
  }
}
