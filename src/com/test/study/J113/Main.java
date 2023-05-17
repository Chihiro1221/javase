package com.test.study.J113;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader stream = new BufferedReader(new FileReader(path("/test.text")))) {
            stream.lines().forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String path(String str) {
        return "/Users/haonan/IdeaProjects/study/src/com/test/study/J113" + str;
    }
}
