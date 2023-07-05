package com.test.study.Book;

public interface Named {
    default String getName() {
        return "123";
    }
}

