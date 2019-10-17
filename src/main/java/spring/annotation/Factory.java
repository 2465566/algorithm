package spring.annotation;

import java.lang.reflect.Proxy;

public class Factory {
        public static Object getMapper(Class clazz){
            return Proxy.newProxyInstance(Factory.class.getClassLoader(),clazz.getInterfaces(),new MyInvocationHandler());
        }
    }

