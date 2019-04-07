package mode.agent.dynamicgaent.cglib;

/**
 * 上面的静态代理和动态代理模式都是要求目标对象是实现一个接口的目标对象,
 * 但是有时候目标对象只是一个单独的对象,并没有实现任何的接口,
 * 这个时候就可以使用以目标对象子类的方式类实现代理,这种方法就叫做:Cglib代理
 */
public class CglibDemo {

  public static void main(String args[]) {
    /**
     * 目标对象
     */
    CglibUserDao target = new CglibUserDao();

    /**
     * 代理对象
     */
    CglibUserDao proxy = (CglibUserDao) new CglibProxyFactory(target).getProxyInstance();

    proxy.save();
  }
}
