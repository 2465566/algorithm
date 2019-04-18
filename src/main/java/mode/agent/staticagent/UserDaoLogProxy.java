package mode.agent.staticagent;

import mode.agent.UserDao;

/**
 * 代理对象，和被代理对象同时实现接口
 */
public class UserDaoLogProxy implements UserDao {

  /**
   * UserDao 接受目标对象
   */
  UserDao userDao;

  UserDaoLogProxy(UserDao userDao) {
    this.userDao = userDao;
  }

  @Override
  public void save() {
    userDao.save();   //执行目标对象业务逻辑
    System.out.println("一次增强日志打印，日志代理，打印日志");  //日志代理第一次增强，打印日志
  }
}
