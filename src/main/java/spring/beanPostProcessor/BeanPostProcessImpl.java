package spring.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 如果想对Bean进行一些自定义的处理，那么可以让Bean实现了BeanPostProcessor接口，
 * 那将会调用postProcessBeforeInitialization(Object obj, String s)方法。
 * 由于这个方法是在Bean初始化结束时调 用的，所以可以被应用于内存或缓存技术；
 */

@Component
public class BeanPostProcessImpl implements BeanPostProcessor {
    @Override
    //bean初始化方法调用前被调用
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("dao")) {
            System.out.println("postProcessBeforeInitialization..." + beanName + " => " + bean);
        }
        return bean;
    }

    @Override
    //bean初始化方法调用后被调用
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
}
