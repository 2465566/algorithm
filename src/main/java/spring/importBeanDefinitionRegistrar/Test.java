package spring.importBeanDefinitionRegistrar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ImportBeanDefinitionRegistrar需要配合@Configuration和@Import注解，@Configuration定义Java格式的Spring配置文件，@Import
 * 注解导入实现了ImportBeanDefinitionRegistrar接口的类。
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ac.getBean("test"));
    }
}
