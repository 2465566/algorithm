package pattern.constructure.agent.dynamicagent.jdkagent.mybatissimulate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SmartMapper smartMapper = method.getAnnotation(SmartMapper.class);
        String sql = smartMapper.value();
        System.out.println(sql);
        return sql;
    }
}
