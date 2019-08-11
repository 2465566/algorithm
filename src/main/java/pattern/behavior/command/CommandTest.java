package pattern.behavior.command;

import pattern.behavior.command.impl.BuyCommand;
import pattern.behavior.command.impl.SellCommand;

public class CommandTest {

  public static void main(String[] args) {
    Stock stock = new Stock();
    BuyCommand buyOrder = new BuyCommand(stock);
    SellCommand sellOrder = new SellCommand(stock);

    CommandBroker broker = new CommandBroker();
    broker.addOrder(buyOrder);
    broker.addOrder(sellOrder);
    broker.placeOrder();
  }
}
