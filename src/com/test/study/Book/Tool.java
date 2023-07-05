package com.test.study.Book;

public interface Tool {
    public static void move() {
        System.out.println("hahahah");
    }

    default int isEmpty() {
        move();
        return 0;
    }
}
