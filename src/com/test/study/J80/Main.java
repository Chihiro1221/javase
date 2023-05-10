package com.test.study.J80;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        test("hdmcs.com");
    }

    public static void test(String str) {
//        Optional.ofNullable(str).ifPresent(s -> System.out.println(s.length()));
        Integer s = Optional.ofNullable(str).map((s1) -> s1.length()).get();
        System.out.println(s);
    }
}