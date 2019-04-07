package mode.agent.dynamicgaent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理.
 */
public class ProxyFactory {

  private Object target;

  public ProxyFactory(Object target) {
    this.target = target;
  }

  public Object getProxyInstance() {
    return Proxy.newProxyInstance(
        target.getClass().getClassLoader(),
        target.getClass().getInterfaces(),
        new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("开始事物");
            Object returnValue = method.invoke(target, args);
            System.out.println("提交事务");
            return returnValue;
          }
        }
    );
  }
}