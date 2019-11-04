package spring.ImportSelector;

import spring.annotation.SmartMapper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

  private Object target;  //传入目标对象

  public MyInvocationHandler(Object target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    SmartMapper smartMapper = method.getAnnotation(SmartMapper.class);
    String sql = smartMapper.value();
    System.out.println("代理打印一下注解sql" + sql);
    return method.invoke(target, args);
  }
}
