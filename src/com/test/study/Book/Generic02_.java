package com.test.study.Book;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Supplier;

public class Generic02_ {
    public static void main(String[] args) {
        Dog dog = new Dog("haha");
        Pair pair = Pair.makePair(String.class);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}

class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {
    }

    public static <T> Pair makePair(Class<T> cls) {
        try {
            return new Pair<>(cls.getConstructor().newInstance(), cls.getConstructor().newInstance());
        } catch (Exception e) {
            return null;
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public static boolean hasNulls(Pair<?> p) {
        return p.getFirst() == null || p.getSecond() == null;
    }
}

