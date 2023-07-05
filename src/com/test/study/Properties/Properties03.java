package com.test.study.Properties;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("site", "https://houdunren.com");
        properties.setProperty("host", "192.168.1.1");
        properties.setProperty("name", "汤米");
        properties.store(new FileOutputStream("src/com/test/study/Properties/mysql2.properties"), "hello world");
        System.out.println("存储成功...");
    }

}
