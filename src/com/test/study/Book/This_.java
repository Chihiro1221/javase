package com.test.study.Book;

import java.util.Random;

/**
 * @params 吃饭睡觉
 * <em>哈哈哈</em>
 * {@code javascript
 *      const user = {username:"houdunren.com"};
 *
 * }
 */
public class This_ {
    public static void main(String[] args) {
        Dog rubby = new Dog("rubby");
        System.out.println(rubby.toString());

        Random random = new Random();
        int i = random.nextInt(1000);
        System.out.println(i);
    }

}

class Dog {
    private String name;
    private int age;

    private static String color;

    static {
        color = "black";
    }

    {
        name = "";
        age = 2;
    }

    public Dog(String name) {
        this(name, 2);
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
