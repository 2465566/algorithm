package pattern.behavior.status;

/**
 * 状态模式和策略模式在结构上完全相同，不同的是在行为上，策略模式环境对象是用户指定的，且只指定一次。
 * 状态模式的环境是系统自己不断调整变化的
 */

public interface Status {
  void perform();
}
