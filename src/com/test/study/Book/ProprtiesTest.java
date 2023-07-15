package com.test.study.Book;

import java.util.Properties;

public class ProprtiesTest {
    public static void main(String[] args) {+
        Properties properties = new Properties();
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.home"));
    }
}
