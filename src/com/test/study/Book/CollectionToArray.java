package com.test.study.Book;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArray {
    public static void main(String[] args) {
        String[] s = new String[]{"haha", "lala"};
        ArrayList<String> strings = new ArrayList<>(List.of(s));
        System.out.println(strings);
        String[] array = strings.toArray(new String[0]);
        System.out.println(array);
    }
}
