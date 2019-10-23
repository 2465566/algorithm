package spring.beanDefinitionRegistryPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ac.getBean("factoryBeanIm"));
    }
}
