package com.test.study.Book;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.BiFunction;

public class FunctionalInterface_ {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("zhangsan");
        stringArrayList.add(null);
        stringArrayList.add("lisi");
        stringArrayList.add("wangwu");
        stringArrayList.removeIf(e -> e == null);
        stringArrayList.removeIf(Objects::isNull);
        System.out.println(stringArrayList);
        BiFunction<String, String, Integer> fn = (o1, o2) -> o1.length() - o2.length();

        Runnable task = System.out::println;
        task.run();
    }
}
