package practise.ut;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<String> strings = Lists.newArrayList();
        strings.add("1");
        strings.add(null);
        strings.add("2");
        System.out.println(strings);
    }
}
