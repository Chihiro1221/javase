package com.test.study.Reflection;
import java.lang.reflect.*;
import java.util.Scanner;

public class ClassLoad_ {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入key");
        String key = scanner.next();
        switch(key){
            case "1":
                Dog dog = new Dog();
                dog.say();
                break;
            case "2":
                Class cls = Class.forName("com.test.study.Reflection.Person");
                Object o = cls.newInstance();
                Method method = cls.getMethod("hi");
                method.invoke(o);
                System.out.println("hello");
                break;
            default:
                System.out.println("default...");
        }
    }
}

class Dog{
    public void say(){
        System.out.println("小狗汪汪汪...");
    }
}

class Person{
    public void hi(){
        System.out.println("你好我是人类...");
    }
}
