package com.test.study.Book;

public enum Size {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L");

    private String name;

    Size(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
