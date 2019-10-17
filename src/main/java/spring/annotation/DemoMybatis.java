package spring.annotation;

public class DemoMybatis {

    public static void main(String[] args) {
        Dao dao = new DaoImpl();
        System.out.println(dao.getClass());
        Dao proxy = (Dao) Factory.getMapper(dao.getClass());
        System.out.println(proxy.getClass());
        proxy.query();
    }
}
