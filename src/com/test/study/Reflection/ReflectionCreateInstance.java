package com.test.study.Reflection;

import java.lang.reflect.Constructor;

public class ReflectionCreateInstance {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("com.test.study.Reflection.User");
        //1. 创建无参构造
        User user = (User) cls.newInstance();
        System.out.println("default user=" + user);
        //2. 创建有参构造
        Constructor<?> constructor = cls.getConstructor(String.class);
        User user1 = (User) constructor.newInstance("张三");
        System.out.println("user1=" + user1);
        //3. 创建私有有参构造
        Constructor<?> constructor1 = cls.getDeclaredConstructor(String.class, int.class);
        // 暴破，使用反射可以使用私有构造器
        constructor1.setAccessible(true);
        User user2 = (User) constructor1.newInstance("李四", 55);
        System.out.println("user2=" + user2);
    }
}

class User {
    public String name = "默认姓名";
    public int age;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
