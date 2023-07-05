package com.test.study.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HomeWork01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("com.test.study.Reflection.PrivateTest");
        Object o = cls.newInstance();
        Field name = cls.getDeclaredField("name");
        Method getName = cls.getDeclaredMethod("getName");
        name.setAccessible(true);
        name.set(o, "张三");
        System.out.println(getName.invoke(o));
    }
}

class PrivateTest {
    private String name = "hellokitty";

    public String getName() {
        return name;
    }


}
