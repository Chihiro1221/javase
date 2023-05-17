package com.test.study.J114;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (InputStreamReader stream = new InputStreamReader(new FileInputStream(path("/test.text")))) {
            System.out.println((char) stream.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String path(String str) {
        return "/Users/haonan/IdeaProjects/study/src/com/test/study/J114" + str;
    }
}
