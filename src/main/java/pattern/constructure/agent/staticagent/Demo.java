package pattern.constructure.agent.staticagent;

import pattern.constructure.agent.UserDao;
import pattern.constructure.agent.UserDaoImpl;

public class Demo {

  public static void main(String args[]) {

    UserDao userDao = new UserDaoImpl();
    UserDaoLogProxy userDaoLogProxy = new UserDaoLogProxy(userDao);
    UserDaoTransactionProxy userDaoTransactionProxy = new UserDaoTransactionProxy(userDaoLogProxy);
    userDaoTransactionProxy.save();
  }
}
