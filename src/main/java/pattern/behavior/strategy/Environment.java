package pattern.behavior.strategy;

public class Environment {

  public CalculateStrategy calculateStrategy;   // 聚合

  Environment(CalculateStrategy calculateStrategy) {
    this.calculateStrategy = calculateStrategy;
  }

  public int calculate(int i, int j) {
    return this.calculateStrategy.calculate(i, j);    // important
  }
}
