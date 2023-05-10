package com.test.study.J82;

import com.test.study.collection.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            list.insert("" + (i + 1), i);
        }
        list.remove(1);
        System.out.println(list);
    }
}