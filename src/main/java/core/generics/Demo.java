package core.generics;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //按照规范new 对象的时候要指定泛型类型，
        // 例如等号后面的<String> ，如果不加，会报代码不规范但是可运行。
        TestGenerics<String> testGenerics = new TestGenerics<String>(String.valueOf(1));
        TestGenerics<Integer> testGenerics1 = new TestGenerics<Integer>(1);

        System.out.println(testGenerics.getName());
        System.out.println(testGenerics1.getName());
        System.out.println(testGenerics1.getAttr(String.valueOf(22)));
        /**
         * 通配符？、？extends T 、？super T
         */
        // ? 一般用于定义一个引用变量,这么做的好处是,如下所示,定义一个testGenerics2的引用变量，就可以指向多个对象。
        TestGenerics<?> testGenerics2 = new TestGenerics<Integer>(1);
        testGenerics2 = new TestGenerics<String>(String.valueOf(1));

        //若不用?,用固定的类型的话而是用确定单类型，则：
        TestGenerics<Integer> testGenerics3 = new TestGenerics<Integer>(1);
//        testGenerics3 =  new TestGenerics<String>(String.valueOf(1));   报类型错误

        List<?> list = Lists.newArrayList(2);
        list = Lists.newArrayList(String.valueOf(1));  //仍然不报错


        /**
         * ? 可以容纳任何类型
         */
        TestGenerics<?> first = new TestGenerics<First>(new First());
        TestGenerics<?> second = new TestGenerics<Second>(new Second());
        TestGenerics<?> third = new TestGenerics<Third>(new Third());


        /**
         * ? extends First  可以接受 First 以及 First的子类
         */
//        TestGenerics<? extends Second> firstExtends = new TestGenerics<First>(new First());    //类型错误
        TestGenerics<? extends Second> secondExtends = new TestGenerics<Second>(new Second());
        TestGenerics<? extends Second> thirdExtends = new TestGenerics<Third>(new Third());

        /**
         * ? super Second 可以接受 Second 以及 Second 的超累
         */
        TestGenerics<? super Second> firstSuper = new TestGenerics<First>(new First());
        TestGenerics<? super Second> secondSuper = new TestGenerics<Second>(new Second());
//      TestGenerics<? super Second> thirdSuper = new TestGenerics<Third>(new Third());           //类型错误
    }
}

