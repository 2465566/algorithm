package pattern.agent.dynamicagent.cglibagent;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxyFactory implements MethodInterceptor {

  private Object target;

  public CglibProxyFactory(Object target) {
    this.target = target;
  }

  public Object getProxyInstance() {

    /**
     * 工具类
     */
    Enhancer en = new Enhancer();

    /**
     * 设置父类
     */
    en.setSuperclass(target.getClass());

    /**
     * 设置回调
     */
    en.setCallback(this);

    /**
     * 创建子类（代理对象）
     */
    return en.create();
  }

  @Override
  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
      throws Throwable {

    System.out.println("开始事务");
    Object returnValue = method.invoke(target, objects);
    System.out.println("提交事务");
    return returnValue;
  }
}
