package core.classloader;

import org.apache.commons.compress.utils.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader {

    /**
     * 如果不想打破双亲委派模型，就只重写ClassLoader类中的findClass()方法即可，
     * 无法被父类加载器加载的类最终会通过这个方法被加载。而如果想打破双亲委派模型则需要重写loadClass()方法（当然其中的坑也不会少）。
     * 典型的打破双亲委派模型的框架和中间件有tomcat与osgi,如果相对java的类加载过程有更深入的了解学习这两个框架的源码会是不错的选择。

     * @param name
     * @return
     * @throws ClassNotFoundException
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String myPath = "/Users/juntao/DeskTop/";
        System.out.println(myPath);
        try {
            InputStream is = new FileInputStream(myPath +  name.replace(".", "/") + ".class");
            byte[] bytes = IOUtils.toByteArray(is);
            return defineClass(name, bytes, 0, bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.loadClass(name);
    }
}
