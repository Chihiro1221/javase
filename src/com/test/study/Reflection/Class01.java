package com.test.study.Reflection;

public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
//        Cat cat = new Cat();
        Class cls = Class.forName("com.test.study.Reflection.Cat");
    }
}
