package com.test.study.Book;

public class Assert_ {
    public static void main(String[] args) {
        test(-10);
    }

    public static void test(int x){
        assert x >= 0 : "x小于0";
        System.out.println(Math.sqrt(x));
    }
}
