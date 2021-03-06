package spring.ImportSelector;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.register(AppConfig.class);
    context.refresh();
    Dao dao = (Dao) context.getBean("daoImpl");
    dao.query();
  }
}
