package com.test.study.Book;

public interface Person {
    default String getName() {
        return "";
    }
}
