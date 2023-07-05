package com.test.study.Book;

import java.util.ArrayList;

public class DoubleBrace {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>() {{
            add("zhangsan");
            add("lisi");
        }};
        System.out.println(strings);
    }
}
