package spring.importBeanDefinitionRegistrar;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

@Component
public class ImportBeanDefinitionRegistrarImpl implements ImportBeanDefinitionRegistrar {

    /**
     * 只有该类被@Import(ImportBeanDefinitionRegistrarImpl.class) 方法才会执行
     * @param annotationMetadata
     * @param beanDefinitionRegistry
     */

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinitionRegistry.registerBeanDefinition("test", beanDefinition);
    }

}
