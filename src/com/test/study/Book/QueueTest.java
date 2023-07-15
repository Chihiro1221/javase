package com.test.study.Book;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        ArrayDeque<String> strings = new ArrayDeque<>(3);
        strings.add("haha");
        strings.add("lala");
        strings.add("test");
        System.out.println(strings);
    }
}
