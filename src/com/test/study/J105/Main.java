package com.test.study.J105;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list = Collections.checkedList(list, Integer.class);
        list.add("AAA");
        System.out.println(list);
    }
}