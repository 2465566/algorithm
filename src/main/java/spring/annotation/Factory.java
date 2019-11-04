package spring.annotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Factory {

    private Object target;

    public Factory(Object target) {
        this.target = target;
    }

    public Object getMapper(Class clazz) {
        return Proxy.newProxyInstance(Factory.class.getClassLoader(), clazz.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                SmartMapper smartMapper = method.getAnnotation(SmartMapper.class);
                method.invoke(target, args);
                String sql = smartMapper.value();
                System.out.println(sql);
                return sql;
            }
        });
    }
}

