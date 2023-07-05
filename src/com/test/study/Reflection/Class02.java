package com.test.study.Reflection;

import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classfullpath = "com.test.study.Reflection.Car";
        Class cls = Class.forName(classfullpath);
        // 输出的是哪个类的Class对象
        System.out.println(cls);
        // 真正运行的类（即Class）
        System.out.println(cls.getClass());
        // 所属的包
        System.out.println(cls.getPackage().getName());
        // 得到全类名
        System.out.println(cls.getName());
        // 获取实例对象
        Car car = (Car) cls.newInstance();
        // 获取成员
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
        brand.set(car, "TESLA");
        System.out.println(brand.get(car));
        // 获取所有成员
        Field[] fields = cls.getFields();
        for (Field f : fields) System.out.println("属性名:" + f.getName());

    }
}
