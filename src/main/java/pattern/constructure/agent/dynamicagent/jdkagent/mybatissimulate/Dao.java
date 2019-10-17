package pattern.constructure.agent.dynamicagent.jdkagent.mybatissimulate;

public interface Dao {

    @SmartMapper("Select * from table where id > 1")
    public void query();
}
