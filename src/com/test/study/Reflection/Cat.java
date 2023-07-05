package com.test.study.Reflection;

public class Cat {
    private String name = "猫猫";
    public int age = 10;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public void hi() {
//        System.out.println("Hi " + name);
    }

    public void m() {
        System.out.println(name + " 嗷呜～！");
    }
}
