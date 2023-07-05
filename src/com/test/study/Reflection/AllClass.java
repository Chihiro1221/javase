package com.test.study.Reflection;

import java.io.Serializable;

public class AllClass {
    public static void main(String[] args) {
        System.out.println(String.class); //外部类
        System.out.println(long.class); //包装类
        System.out.println(Override.class);//注解类
        System.out.println(Serializable.class); //接口类
        System.out.println(Thread.State.BLOCKED.getClass()); //枚举类
        System.out.println(void.class); //void类
        System.out.println(int[].class); //数组类
    }
}
