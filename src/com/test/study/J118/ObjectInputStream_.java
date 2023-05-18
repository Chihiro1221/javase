package com.test.study.J118;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "/Users/haonan/IdeaProjects/study/src/com/test/study/J118/data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readDouble());
        System.out.println(ois.readChar());
        System.out.println(ois.readUTF());
        Dog dog = (Dog) ois.readObject();
        System.out.println("编译时类为：" + dog.getClass());
        System.out.println("dog信息：" + dog);
        ois.close();
    }
}
