package com.test.study.Reflection;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        String classFullPath = "com.test.study.Reflection.Car";
        //1. 通过forName
        Class cls = Class.forName(classFullPath);
        System.out.println(cls);
        //2. 通过类的class
        System.out.println(Car.class);
        //3. 通过实例的getClass
        Car car = new Car();
        System.out.println(car.getClass());
        //4. 通过加载器获取
        Class cls2 = new Car().getClass().getClassLoader().loadClass(classFullPath);
        System.out.println(cls2);

        //5. 基本类型class
        System.out.println(int.class);
        System.out.println(char.class);
        //6. 包装类型 TYPE
        System.out.println(Integer.TYPE);
        System.out.println(Character.TYPE);
        System.out.println(Integer.TYPE.hashCode());
        System.out.println(int.class.hashCode());
    }
}
