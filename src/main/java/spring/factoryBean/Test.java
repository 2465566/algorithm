package spring.factoryBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ac.getBean(MyFactoryBean.class));
        System.out.println(ac.getBean("myFactoryBean"));
        System.out.println(ac.getBean("&myFactoryBean"));
    }
}
