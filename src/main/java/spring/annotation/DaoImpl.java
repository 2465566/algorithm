package spring.annotation;

public class DaoImpl implements Dao {
    @Override
    public void query() {
        System.out.println("为此处目标对象，处理业务逻辑");
    }
}
