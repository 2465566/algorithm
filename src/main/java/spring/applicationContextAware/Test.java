package spring.applicationContextAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class);
        MyFaced myFaced =annotationConfigApplicationContext.getBean(MyFaced.class);
        System.out.println(myFaced);
        myFaced.getContext();
    }
}
