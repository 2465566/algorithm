package pattern.behavior.command.impl;

import pattern.behavior.command.Command;
import pattern.behavior.command.Stock;

public class SellCommand implements Command {

  private Stock stock;

  public SellCommand(Stock stock) {
    this.stock = stock;
  }

  @Override
  public void execute() {
    stock.sell();
  }
}
