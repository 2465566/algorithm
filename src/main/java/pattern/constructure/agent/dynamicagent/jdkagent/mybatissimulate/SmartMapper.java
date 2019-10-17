package pattern.constructure.agent.dynamicagent.jdkagent.mybatissimulate;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Component
@Documented
public @interface SmartMapper {
    String value() default "select * from table where id > 0";
}
