package mode.strategy.impl;

import mode.strategy.CalculateStrategy;

public class SubCalculateStrategyImpl implements CalculateStrategy {

  @Override
  public int calculate(int i, int j) {
    return i - j;
  }
}
