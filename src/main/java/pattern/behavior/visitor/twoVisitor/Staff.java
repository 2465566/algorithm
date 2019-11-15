package pattern.behavior.visitor.twoVisitor;

import java.util.Random;

/**
 * 抽象元素，一般是一个抽象类或接口，定义一个Accept方法，该方法通常以一个抽象访问者作为参数。
 */
public abstract class Staff {

  public String name;
  public int kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    // 接受访问者访问对的接口, 具体被访者通过重写这个方法 通过传进来的访问者 visitorI.visit(自己)
  public abstract void accept(VisitorI visitorI);
}
