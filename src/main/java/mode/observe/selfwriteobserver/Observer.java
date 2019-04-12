package mode.observe.selfwriteobserver;

public abstract class Observer {

  public abstract void update();

  protected Subject subject;

  // 此处的 subject 是用来把继承当前抽象类的观察对象通过参数传递的方式加进此subject，如main中 subject.attach(this);

  /**
   *  Subject subject = new Subject();
   *  new FirstObserverImpl(subject);
   */

  /**
   *   public FirstObserverImpl(Subject subject) {
   *     this.subject = subject;
   *     this.subject.attach(this);
   *   }
   */

}
