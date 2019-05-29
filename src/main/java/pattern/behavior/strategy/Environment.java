package pattern.behavior.strategy;

public class Environment {

  public CalculateStrategy CalculateStrategy;   // 聚合

  Environment(CalculateStrategy calculateStrategy) {
    this.CalculateStrategy = calculateStrategy;
  }

  public int calculate(int i, int j) {
    return this.CalculateStrategy.calculate(i, j);    // important
  }
}
