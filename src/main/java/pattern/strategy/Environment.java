package pattern.strategy;

public class Environment {

  public CalculateStrategy CalculateStrategy;

  Environment(CalculateStrategy calculateStrategy) {
    this.CalculateStrategy = calculateStrategy;
  }

  public int calculate(int i, int j) {
    return this.CalculateStrategy.calculate(i, j);    // important
  }
}
