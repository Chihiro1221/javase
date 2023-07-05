package com.test.study.Book;
import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("houdunren.com");
        list.add("hdcms.com");
        list.add("yahoo.com");
//        Object[] objects = list.toArray();
//        for (Object s : objects) {
//            System.out.println(s);
//        }

        String[] strings = new String[list.size()];
        String[] strings1 = list.toArray(strings);
        for (String string : strings1) {
            System.out.println(string);
        }

        Integer a = 100;
        Integer b=  100;
        System.out.println(a == b);
    }
}
