package mode.agent.dynamicagent.jdkagent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理.
 */
public class ProxyFactory { //不需要实现接口

  private Object target;  // 接受目标对象

  public ProxyFactory(Object target) {
    this.target = target;
  }

  public Object getProxyInstance() {
    return Proxy.newProxyInstance(
        target.getClass().getClassLoader(),
        target.getClass().getInterfaces(),   //需要传入目标对象的接口，所以目标对象一定要实现接口
        new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("开始事物"); // 执行代理功能
            Object returnValue = method.invoke(target, args);  //执行目标对象核心功能
            System.out.println("提交事务"); // 执行代理功能
            return returnValue;
          }
        }
    );
  }
}
