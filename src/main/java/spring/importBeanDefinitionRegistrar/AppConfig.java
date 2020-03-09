package spring.importBeanDefinitionRegistrar;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration  //needed
@ComponentScan("spring.importBeanDefinitionRegistrar")
@Import(ImportBeanDefinitionRegistrarImpl.class)
public class AppConfig {

}
