package pattern.behavior.strategy.impl;

import pattern.behavior.strategy.CalculateStrategy;

public class SubCalculateStrategyImpl implements CalculateStrategy {

  @Override
  public int calculate(int i, int j) {
    return i - j;
  }
}
