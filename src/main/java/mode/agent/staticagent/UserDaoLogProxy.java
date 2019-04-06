package mode.agent.staticagent;

/**
 * 代理对象，和被代理对象同时实现接口
 */
public class UserDaoLogProxy implements UserDao{

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
    System.out.println("日志代理，打印日志");  //代理增强目标对象，打印日志
  }
}
