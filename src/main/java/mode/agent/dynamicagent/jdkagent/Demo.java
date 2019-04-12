package mode.agent.dynamicagent.jdkagent;

import mode.agent.UserDao;
import mode.agent.UserDaoImpl;

/**
 * JDK代理
 */
public class Demo {
  public static void main(String args[]) {
    /**
     * 目标对象
     */
    UserDao userDao = new UserDaoImpl();
    System.out.println(userDao.getClass());


    /**
     * 给目标对象创建代理对象
     */
    UserDao proxy = ((UserDao) new ProxyFactory(userDao).getProxyInstance());
    System.out.println(proxy.getClass());

    proxy.save();
  }

}
