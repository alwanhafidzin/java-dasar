package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListFilter {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.add("B");
        strings.add("C");
        strings.add("C");
        strings.add("C");
        strings.add("C");
//        List<String> filterList = strings.stream().filter(String::"A").collect(Collectors.toList());
    }
}
