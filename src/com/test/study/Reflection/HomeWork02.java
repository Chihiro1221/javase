package com.test.study.Reflection;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HomeWork02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException {
        Class<?> fileCls = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        Constructor<?> declaredConstructor = fileCls.getDeclaredConstructor(String.class);
        Object o = declaredConstructor.newInstance("/Users/haonan/IdeaProjects/study/src/com/test/study" +
                "/Reflection/mynew.text");
        Method createNewFile = fileCls.getMethod("createNewFile");
        createNewFile.invoke(o);
    }
}
