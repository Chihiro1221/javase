package com.test.study.J83;

import com.test.study.collection.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        for (int i = 0; i < 30; i++) {
            list.insert(1 + i + "", i);
        }
        list.remove(1);
        System.out.println(list);
    }
}