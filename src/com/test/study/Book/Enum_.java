package com.test.study.Book;

public class Enum_ {
    public static void main(String[] args) {
        Size s = Enum.valueOf(Size.class, "SMALL");
        Size[] values = Size.values();
        System.out.println(s);
        System.out.println(Size.SMALL.toString());
        System.out.println(Size.LARGE.ordinal());
        for (Size value : values) {
            System.out.print(value + "->");
        }
    }
}
