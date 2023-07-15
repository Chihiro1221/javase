package com.test.study.Book;

import java.util.ArrayList;

public class Generic01_ {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>() {
            @Override
            public String get(int index) {
                return super.get(index).replace(".", "*");
            }
        };
    }
}
