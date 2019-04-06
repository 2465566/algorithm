package mode.agent.staticagent;

public class UserDaoTransactionProxy implements UserDao {

  public UserDaoTransactionProxy(UserDao userDao) {
    this.userDao = userDao;
  }

  /**
   * UserDao 接受目标对象
   */
  UserDao userDao;



  @Override
  public void save() {
    System.out.println("代理对象开始执行事物");
    userDao.save();
    System.out.println("代理对象事物执行完毕");
  }
}
