package spring.beanDefinitionRegistryPostProcessor;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;

public class FactoryBeanIm implements FactoryBean {   // 不加 @Component, 通过 MyBeanFactoryPostProcessor 设置 beanDefinition
    @Override
    public Object getObject() throws Exception {
        return new ProxyMapper();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
