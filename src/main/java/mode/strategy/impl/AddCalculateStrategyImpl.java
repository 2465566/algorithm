package mode.strategy.impl;

import mode.strategy.CalculateStrategy;

public class AddCalculateStrategyImpl implements CalculateStrategy {


  @Override
  public int calculate(int i, int j) {
    return i + j;
  }
}
