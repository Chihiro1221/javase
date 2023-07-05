package com.test.study.Reflection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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
        // 4. 调用方法（将实例对象传入）
        method1.invoke(o);

    }
}
