package com.test.study.Book;

import java.io.Serializable;

public class GenericMethod {
    public static void main(String[] args) {
        String hello = Dog2.<String>hello(new String[]{"tommy", "author", "John"});
        System.out.println(hello);
    }

}


class Dog2 {
    public static <T extends Serializable> T hello(T[] args) {
        return args[args.length - 1];
    }
}
