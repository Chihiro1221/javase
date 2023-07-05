package com.test.study.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("com.test.study.Reflection.Boss");
        Object o = cls.newInstance();
        Method hi = cls.getDeclaredMethod("hi", String.class);
        System.out.println(hi.invoke(o, "张三"));

        Method hello = cls.getDeclaredMethod("hello", String.class, int.class, String.class);
        hello.setAccessible(true);
        Object returnValue = hello.invoke(null, "李四", 20, "男");
        System.out.println(returnValue + " " + returnValue.getClass());
    }

}

class Boss {
    public int age;
    private static String name = "默认姓名";

    private static String hello(String name, int age, String sex) {
        return name + " " + age + " " + sex;
    }

    public String hi(String name) {
        return "hi~ 你好啊," + name;
    }
}