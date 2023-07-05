package com.test.study.Reflection;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion2 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("src/com/test/study/Reflection/re.properties"));
        String classfullpath = properties.getProperty("classfullpath").toString();
        String method = properties.getProperty("method").toString();
        // 使用普通方式无法实现通过读入的配置文件去常见对象调用方法等
        // 1. 根据路径获取类
        Class cls = Class.forName(classfullpath);
        // 2. 根据类创建对应的实例
        Object o = cls.newInstance();
        // 3. 获取类实例对象的方法
        Method method1 = cls.getMethod(method);
        // 3. 获取类实例对象的成员属性（注意：无法获得私有成员）
        Field field = cls.getField("age");
        // 3.获取类构造器，不传入参数的话代表无参构造
        Constructor constructor = cls.getConstructor();
        Constructor constructor1 = cls.getConstructor(String.class);
        // 4. 调用方法（将实例对象传入）
        method1.invoke(o);
        System.out.println(field.get(o));
        System.out.println(constructor);
        System.out.println(constructor1);
    }
}
