package thread.threadlocal;

import java.util.ArrayList;
import java.util.List;


/**
 *  每个Thread 维护一个 ThreadLocalMap(ThreadLocal 内部类) 映射表，这个映射表的 key 是 ThreadLocal 实例本身，value 是真正需要存储的 Object。
 */
public class ThreadLocalTest {

    private static ThreadLocal<List<String>> threadLocal1 = new ThreadLocal<>();
    private static ThreadLocal<List<String>> threadLocal2 = new ThreadLocal<>();

    public static void main(String[] args) {
        final ThreadLocalTest t = new ThreadLocalTest();
        List<String> strs1 = new ArrayList<String>();
        List<String> strs2 = new ArrayList<String>();
        strs1.add("1");
        strs1.add("a");
        strs2.add("2");
        strs2.add("b");

        new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal1.set(strs1);
                threadLocal2.set(strs2);

                threadLocal1.get().forEach(name -> System.out.println(Thread.currentThread().getName() + "--threadLocal1--" + name));
                threadLocal2.get().forEach(name -> System.out.println(Thread.currentThread().getName() + "--threadLocal2--" + name));

            }
        }, "t1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {

                threadLocal1.set(strs1);
                threadLocal2.set(strs2);

                threadLocal1.get().forEach(name -> System.out.println(Thread.currentThread().getName() + "--threadLocal1--" + name));
                threadLocal2.get().forEach(name -> System.out.println(Thread.currentThread().getName() + "--threadLocal2--" + name));

            }
        }, "t2").start();
    }



}
