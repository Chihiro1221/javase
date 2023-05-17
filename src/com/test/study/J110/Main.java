package com.test.study.J110;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileOutputStream stream = new FileOutputStream(path("/video2.mp4"), true);
             FileInputStream inputStream = new FileInputStream(path("/video1.mp4"))
        ) {
            byte[] bytes = new byte[1024];
            while ((inputStream.read(bytes)) != -1) {
                stream.write(bytes);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String path(String str) {
        return "/Users/haonan/IdeaProjects/study/src/com/test/study/J110" + str;
    }
}
