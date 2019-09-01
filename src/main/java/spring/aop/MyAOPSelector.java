package spring.aop;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAOPSelector implements ImportSelector {

  @Override
  public String[] selectImports(AnnotationMetadata annotationMetadata) {
    /**
     * 如果开启注解，DaoBeanPostProcessor，完成代理。否则不处理。
     */
    return new String[]{DaoBeanPostProcessor.class.getName()};
  }
}
