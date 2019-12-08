package core.classloader;


import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClassLoader classLoader = new MyClassLoader();
        Class<?> aClass = classLoader.findClass("core.generics.First");
        try {
            System.out.println("classloader :" + aClass.getClassLoader());
            Object obj = aClass.newInstance();
            Method method = aClass.getMethod("print");
            /**
             *@param obj  the object the underlying method is invoked from
             */
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
