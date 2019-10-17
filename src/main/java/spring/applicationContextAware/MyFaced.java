package spring.applicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MyFaced implements ApplicationContextAware {   // test get applicationContext by implements ApplicationContextAware
    private ApplicationContext applicationContext;

    public void getContext() {
        System.out.println(applicationContext.getDisplayName());
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
