package mode.strategy;

import mode.strategy.impl.AddCalculateStrategyImpl;
import mode.strategy.impl.SubCalculateStrategyImpl;

public class StrategyDemo {
  public static void main(String args[]) {
    int i = 5;
    int j = 4;
    Environment addEnvironment = new Environment(new AddCalculateStrategyImpl());
    int addResult = addEnvironment.calculate(i, j);
    System.out.println("Add result: " + String.valueOf(addResult));

    Environment subEnvironment = new Environment(new SubCalculateStrategyImpl());
    int subResult = subEnvironment.calculate(i, j);
    System.out.println("Sub result: " + String.valueOf(subResult));

  }
}
