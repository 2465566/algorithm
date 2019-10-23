package spring.beanDefinitionRegistryPostProcessor;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;

public class FactoryBeanIm implements FactoryBean {
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
