package spring.aop;


import org.springframework.context.annotation.ComponentScan;

@ComponentScan("spring.aop")
//@Import(MyAOPSelector.class) 可以直接import 但是太傻，应该通过注解去 @Import(MyAOPSelector.class)，实现动态开启关闭。
@EnableTrans  // 加注解注解 开启事物代理， 注释掉关闭代理
public class AppConfig {

}
