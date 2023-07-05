package com.test.study.Reflection;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static java.lang.Class.forName;

public class ReflectionUtils {
    @Test
    public void api_02() throws ClassNotFoundException {
        Class<?> cls = forName("com.test.study.Reflection.Person1");
        // 获取该类的所有属性
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            int modifiers = declaredField.getModifiers();
            Class<?> type = declaredField.getType();
            System.out.println("该类所有属性=" + declaredField.getName() +
                    " 该属性的修饰符=" + modifiers +
                    " 该属性的类型=" + type
            );
        }

        // 获取该类的所有方法
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("该类所有方法=" + declaredMethod.getName() +
                    "该方法的修饰符=" + declaredMethod.getModifiers() +
                    "该方法的返回参数=" + declaredMethod.getReturnType());
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该方法的参数类型为=" + parameterType);
            }
        }

        // 获取所有构造器
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("该类的所有构造器" + declaredConstructor.getName());
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该构造器的参数类型=" + parameterType);
            }
        }
    }

    @Test
    public void api_01() throws ClassNotFoundException {
        Class<?> cls = forName("com.test.study.Reflection.Person1");
        // 获取类名
        System.out.println(cls.getName());
        // 获取简单类名
        System.out.println(cls.getSimpleName());
        // 获取该类与其父类的public属性
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println("该类与其父类public属性=" + field.getName());
        }
        // 获取该类的所有属性
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("该类所有属性=" + declaredField.getName());
        }
        // 获取该类与其父类的public方法
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println("该类与其父类方法=" + method.getName());
        }
        // 获取该类的所有方法
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("该类所有方法=" + declaredMethod.getName());
        }
        // 获取该类实现的接口
        Class<?>[] interfaces = cls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("实现接口=" + anInterface.getName());
        }
        // 获取该类的注解
        Annotation[] annotations = cls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("该类的注解=" + annotation);
        }
        // 获取父类
        Class<?> superclass = cls.getSuperclass();
        System.out.println(superclass.getName());

        // 获取public构造器
        Constructor<?>[] constructors = cls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("该类的public构造器=" + constructor.getName());
        }

        // 获取所有构造器
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("该类的所有构造器" + declaredConstructor.getName());
        }
    }

}

class B {
    public B() {
    }

    public B(String name) {
    }

    public String language;

    public void hi() {
    }

}

interface IA {
}

interface IB {
}

@Deprecated
class Person1 extends B implements IA, IB {
    public String name;
    protected static int age;
    String job;
    private String salary;

    public Person1() {
    }

    private Person1(String name) {
    }

    public String m1(String name, int age, boolean sex) {
        return null;
    }

    protected void m2() {
    }

    void m3() {
    }

    private void m4() {
    }
}

