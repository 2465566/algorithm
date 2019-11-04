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
         * 需要把 beanDefinition 的 AutowiredModel 设成2，
         * 在baseUp中不用加@Autowired 而是加一个 set方法即可完成自动装配。
         * 这也说明@Autowired 不是根据 byType 装配的
         */
        a.setAutowireMode(2);

        /**
         * 注意：在自定义beanFactoryPostProcessor 中不能通过beanFactory去获取容器中bean。
         * 比如beanFactory.getBean("xxx"); 会导致xxx这个bean类引用的属性为空。
         * 因为beanFactoryPostProcesstor执行的阶段spring还未将每个bean整个实例化完。
         * 所以在调用getBean的时候会直接去生成这个对象，并且给对象属性包装。当
         * spring发现xxx里面引用了user标注@Autowire就会从容器中找"user"这个bean但是此时"user"这个bean还未实例化，所以为空。
         */
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        /**
         * 在容器解析 BeanDefinition 之前（实现BeanDefinitionRegistryPostProcessor） 手动添加 自己的 BeanDefinition，spring
         * 会扫描到然后帮我们初始化, baseType 中就不用加 @Component了。
         */
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(BaseType.class);
        beanDefinition.setAutowireMode(2);
        beanDefinitionRegistry.registerBeanDefinition("baseType", beanDefinition);
    }
}
