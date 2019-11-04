package spring.ImportSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAOPSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        /**
         * 如果开启注解，DaoBeanPostProcessor 被被添加到spring beanDefinition maps.。
         */
        return new String[]{DaoBeanPostProcessor.class.getName()};
    }
}
