package com.test.study.Reflection;

import java.lang.reflect.Method;

public class Reflection01 {
    public static void main(String[] args) throws Exception {
        m1();
        m2();
    }
    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; ++i) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("m1() 总耗时: " + (end - start));
    }

    public static void m2() throws Exception {
        Class cls = Class.forName("com.test.study.Reflection.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        // 将java安全检测关闭，可提升性能
        hi.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; ++i) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2() 总耗时: " + (end - start));
    }
}
