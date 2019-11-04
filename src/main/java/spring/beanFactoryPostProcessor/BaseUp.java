package spring.beanFactoryPostProcessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BaseUp {

    @Autowired
    private Base base;
    private BaseType baseType;

    public void setBaseType(BaseType baseType) {
        this.baseType = baseType;
    }
}
