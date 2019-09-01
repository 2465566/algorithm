package spring.aop;

import java.lang.reflect.Proxy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DaoBeanPostProcessor implements BeanPostProcessor {

  @Override
  public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
    if (s.equals("daoImpl")) {
      o = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{Dao.class},
          new MyInvocationHandler(o));
    }
    return o;
  }

  @Override
  public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
    return o;
  }

}
