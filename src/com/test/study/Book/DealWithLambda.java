package com.test.study.Book;

import java.util.function.IntConsumer;

public class DealWithLambda {
    public static void main(String[] args) {
        repeat(10,(i) -> System.out.println(i));
    }

    public static void repeat(int n, IntConsumer action){
        for(int i = 0; i < n; ++i) action.accept(i);
    }
}
