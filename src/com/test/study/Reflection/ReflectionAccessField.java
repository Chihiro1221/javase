package com.test.study.Reflection;

import java.lang.reflect.Field;

public class ReflectionAccessField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<?> cls = Class.forName("com.test.study.Reflection.User01");
        Object o = cls.newInstance();
        Field name = cls.getField("name");
        name.set(o, "张三丰");
        System.out.println(o);
        System.out.println(name.get(o));

        Field age = cls.getDeclaredField("age");
        age.setAccessible(true);
        age.set(o, 18);
        System.out.println(age.get(o));
    }

}

class User01 {
    public String name = "默认姓名";
    private static int age;

    @Override
    public String toString() {
        return "User01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

