package pattern.agent;

/**
 * 目标对象，继承接口
 */
public class UserDaoImpl implements UserDao{

  @Override
  public void save() {
    System.out.println("为此处目标对象，处理业务逻辑");
  }
}
