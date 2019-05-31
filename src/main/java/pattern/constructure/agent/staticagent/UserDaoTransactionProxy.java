package pattern.constructure.agent.staticagent;

import pattern.constructure.agent.UserDao;

public class UserDaoTransactionProxy implements UserDao {

  public UserDaoTransactionProxy(UserDao userDao) {
    this.userDao = userDao;
  }

  /**
   * UserDao 接受目标对象
   */
  UserDao userDao;   //聚合

  @Override
  public void save() {
    userDao.save();  //执行业务和日志代理一次增强逻辑
    System.out.println("二次增强事物处理");  // 事物代理二次增强
  }
}
