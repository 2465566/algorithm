package spring.beanFactoryPostProcessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseUp {
    @Autowired
    private Base base;
}