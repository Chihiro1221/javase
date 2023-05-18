package com.test.study.J118;

import java.io.Serializable;

public class Dog implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private static String color;
    private transient String nation;
    private Master master = new Master();

    public Dog(String name, int age, String nation) {
        this.nation = nation;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                '}' + nation + "master=" + master;
    }
}