package mode.sigleleton;

/**
 * 懒汉式单例即在使用使用时才创建类的实例，工厂方法增加类synchronized关键字以保证线程安全。
 * 在多线程访问的环境下，同步方法导致系统性能下降。优点在于，类加载时不用自行实例化对象，避免加载缓慢。
 */
public class Singleton {

  private static Singleton instance = null;

  private Singleton() {
  }

  public static synchronized Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}

/**
 * 饿汉式单例，在类加载式自行实例化对象。 优点在于多线程环境下不会出现线程安全问题，因为类只加载一次。
 * 缺点在于，系统加载时消耗额外资源，如果该实例没有使用的情况会造成资源浪费。

public class Singleton {

  private static Singleton instance = new Singleton();

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
 */


/**
 *
 * 双重检测锁定（Double-Check Locking）方案属于懒汉式，使用延时加载技术，避免类加载时任务过重和造成资源浪费，同时将synchronized关键字加在代码块中，减少线程同步锁定以提升系统性能。instance实例使用了volatile关键字修饰，主要是避免在多线程环境下由于编译器进行的重排序操作而导致的线程安全问题。JVM在创建一个对象时会进行以下步骤：
 * 1）分配对象内存空间；
 * 2）初始化对象；
 * 3）设置instance指向分配的内存地址；
 * 编译器为了优化性能，可能会将2、3操作调换顺序，假设A线程在执行new Singleton()方法时，由于2、3操作重排序，而初始化对象操作尚未完成时释放了锁。线程B获取锁之后会发现instance已经不为空，当线程B获取到instance对象后如果直接使用就会出错，原因就是对象没有进行初始化操作。而volatile关键字能避免重排序，因此能保证线程安全。总体上来说，双重检测由于加了锁，多线程并发下还是会有效率问题。

public class Singleton {

  private static volatile Singleton instance;

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (instance == null) {
      synchronized (Singleton.class) {
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }
    return instance;
  }
}
*/


