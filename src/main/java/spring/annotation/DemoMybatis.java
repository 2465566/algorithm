package spring.annotation;

public class DemoMybatis {

    public static void main(String[] args) {
        Dao dao = new DaoImpl();
        Factory factory = new Factory(dao);
        Dao proxy = (Dao) factory.getMapper(dao.getClass());
        proxy.query();
    }
}
