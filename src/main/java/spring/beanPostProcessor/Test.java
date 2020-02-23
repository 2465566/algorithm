package spring.beanPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.beanFactoryPostProcessor.GlobalAppConfig;
import spring.factoryBean.MyFactoryBean;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
