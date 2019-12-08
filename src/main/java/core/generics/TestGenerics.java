package core.generics;

public class TestGenerics<T> {
    private T t;

    public TestGenerics(T t) {
        this.t = t;
    }

    public String getName() {
        return t.getClass().getSimpleName();
    }

    // 方法上的第一个<T>代表括号里面要用到泛型参数，若类中传了泛型，此处可以不传，调用类型上面的泛型参数，
    // 前提是方法中使用的泛型与类中传来的泛型一致。
    public <T>String getAttr(T t) {
        return  t.getClass().getName();
    }
}
