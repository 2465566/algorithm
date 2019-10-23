package spring.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;
import spring.beanDefination.BeanDefinitionImpl;

@Component  // Component is needed
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor, BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition a = (GenericBeanDefinition)
                beanFactory.getBeanDefinition("baseUp");
        //打印A @Autowired 的注入模型是0
        System.out.println("a mode="+a.getAutowireMode());

        /**
         * 如果不用@Autowired， 而是想通过byType 的 set方法完成自动装配，
         * 需要把需要注入的 bean 的 beanDefinition 的 AutowiredModel 设成2，
         * 在需要注入该bean 的中不用加@Autowired 而是加一个 set方法即可完成自动装配。
         * 这也说明@Autowired 不是根据 byType 装配的
         */
        GenericBeanDefinition a1 = (GenericBeanDefinition)
                beanFactory.getBeanDefinition("baseType");
        a1.setAutowireMode(2);
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        /**
         * 在容器解析 BeanDefinition 之前（实现BeanDefinitionRegistryPostProcessor） 手动添加 自己的 BeanDefinition，spring 会扫描到然后帮我们初始化
         */
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(BaseType.class);
        beanDefinition.setAutowireMode(2);
        beanDefinitionRegistry.registerBeanDefinition("baseType", beanDefinition);
    }
}
