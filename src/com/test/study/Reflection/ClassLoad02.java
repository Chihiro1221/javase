package com.test.study.Reflection;

public class ClassLoad02 {
    public static void main(String[] args) {
        // <clinit>合并
        /*
             System.out.println("静态代码块");
             num = 300;
             num =  100;

             最终合并之后为：
             System.out.println("静态代码块");
             num =  100;
         */
        new A();
        System.out.println(A.num);
    }
}

class A {
    static {
        System.out.println("静态代码块");
        num = 300;
    }
    public static int num =  100;

    public A() {
        System.out.println("构造函数");
    }
}
