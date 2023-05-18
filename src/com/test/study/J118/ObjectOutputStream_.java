package com.test.study.J118;

import java.io.*;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        String path = "/Users/haonan/IdeaProjects/study/src/com/test/study/J118/data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeDouble(9.1);
        oos.writeChar('A');
        oos.writeUTF("houdunren.com");
        oos.writeObject(new Dog("小黄", 18, "德国🇩🇪"));
        oos.close();
        System.out.println("对象序列化完毕");
    }

}
