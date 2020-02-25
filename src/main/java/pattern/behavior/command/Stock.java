package pattern.behavior.command;

//命令接受对象
public class Stock {

  private Integer BuyNum = 20;
  private Integer sellNum = 10;

  private String name = "stockProcess";

  public void buy() {
    System.out.println("buy stock " + name + " --- num :" + BuyNum);
  }

  public void sell() {
    System.out.println("sell stock " + name + " --- num :" + sellNum);
  }
}
