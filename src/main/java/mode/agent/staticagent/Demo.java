package mode.agent.staticagent;

public class Demo {

  public static void main(String args[]) {

    UserDao userDao = new UserDaoImpl();
    UserDaoLogProxy userDaoLogProxy = new UserDaoLogProxy(userDao);
    UserDaoTransactionProxy userDaoTransactionProxy = new UserDaoTransactionProxy(userDaoLogProxy);      //多个代理类即是聚合。
    userDaoTransactionProxy.save();
  }

}
