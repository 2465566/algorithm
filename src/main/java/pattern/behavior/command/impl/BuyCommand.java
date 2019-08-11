package pattern.behavior.command.impl;

import pattern.behavior.command.Command;
import pattern.behavior.command.Stock;

public class BuyCommand implements Command {

  private Stock stock;

   public BuyCommand(Stock stock) {
    this.stock = stock;
  }

  @Override
  public void execute() {
    this.stock.buy();
  }
}
