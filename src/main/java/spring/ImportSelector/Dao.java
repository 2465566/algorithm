package spring.ImportSelector;


import spring.annotation.SmartMapper;

public interface Dao {
  @SmartMapper("select * from table where id = 1")
  void query();
}
