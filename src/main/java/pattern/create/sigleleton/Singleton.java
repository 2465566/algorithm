package pattern.create.sigleleton;

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
 * 双重检测锁定（Double-Check Locking）方案属于懒汉式，使用延时加载技术，避免类加载时任务过重和造成资源浪费，
 * 同时将synchronized关键字加在代码块中，减少线程同步锁定以提升系统性能。
 * instance实例使用了volatile关键字修饰，主要是避免在多线程环境下由于编译器进行的重排序操作而导致的线程安全问题。JVM在创建一个对象时会进行以下步骤：
 *
 * 1）分配对象内存空间；
 * 2）初始化对象；
 * 3）设置instance指向分配的内存地址；
 *

 *
 * 编译器为了优化性能，可能会将2、3操作调换顺序，假设A线程在执行new Singleton()方法时，由于2、3操作重排序，而初始化对象操作尚未完成时释放了锁。
 * 线程B获取锁之后会发现instance已经不为空，当线程B获取到instance对象后如果直接使用就会出错，原因就是对象没有进行初始化操作。
 * 而volatile关键字能避免重排序避免 double-checked locking （DCL） 失效，因此能保证线程安全。总体上来说，双重检测由于加了锁，多线程并发下还是会有效率问题。
 *
 * 编译器优化（指令重排序）的操作如下：
 * 1.分配一块内存M
 * 2.将M的地址值赋给instance
 * 3.在内存M上初始化Singleton对象

public class Singleton {

  private static volatile Singleton instance;   //禁止指令重拍，避免 double-checked locking （DCL） 失效

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (instance == null) {                    -------第二个线程已经不为null, 但会一个尚未初始化的对象
      synchronized (Singleton.class) {
        if (instance == null) {
          instance = new Singleton();   ----例如第一个线程 还未3.在内存M上初始化Singleton对象，线程停止。
        }
      }
    }
    return instance;
  }
}

 (2) 线程安全的懒汉式单例 —— 内部类方式
 内部类方式线程安全懒汉式单例的内在原理在于：虚拟机会保证一个类的类构造器<clinit>()在多线程环境中被正确的加锁、同步，如果多个线程同时去初始化一个类，
 那么只会有一个线程去执行这个类的类构造器<clinit>()，其他线程都需要阻塞等待，直到活动线程执行<clinit>()方法完毕。特别需要注意的是，在这种情形下，
 其他线程虽然会被阻塞，但如果执行<clinit>()方法的那条线程退出后，其他线程在唤醒之后不会再次进入/执行<clinit>()方法，因为在同一个类加载器下，一个类型只会被初始化一次。
   public class Singleton {
      private static class InnerClass {
      private final static Singleton instance = new Singleton();
   }

  private Singleton() {}

   public static Singleton getInstalce() {
      return InnerClass.instance;
   }
 */



