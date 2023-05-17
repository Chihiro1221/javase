package com.test.study.J107;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String site = "/Users/haonan/IdeaProjects/study/src/com/test/study" +
                "/J107/test.text";
        try (FileInputStream stream = new FileInputStream(site)) {
            byte[] bytes = new byte[stream.available()];
            stream.read(bytes);
            System.out.println(new String(bytes));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
