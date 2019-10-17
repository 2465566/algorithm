package spring.annotation;

public interface Dao {

    @SmartMapper("Select * from table where id > 1")
    public void query();
}
