package pattern.behavior.cursor;

public class Cursor {
    /**
     * 迭代子模式又叫游标(Cursor)模式，是对象的行为模式。迭代子模式可以顺序地访问一个聚集中的元素而不必暴露聚集的内部表象（internal representation）。
     * 一般来说，集合中非常常见，如果对集合类比较熟悉的话，理解本模式会十分轻松。这句话包含两层意思：一是需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问。
     *
     * 迭代子模式优点
     * 迭代子模式简化了聚集的接口。迭代子具备了一个遍历接口，这样聚集的接口就不必具备遍历接口。
     * 每一个聚集对象都可以有一个或多个迭代子对象，每一个迭代子的迭代状态可以是彼此独立的。因此，一个聚集对象可以同时有几个迭代在进行之中。
     * 由于遍历算法被封装在迭代子角色里面，因此迭代的算法可以独立于聚集角色变化。
     */
}
