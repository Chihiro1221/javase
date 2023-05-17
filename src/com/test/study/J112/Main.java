package com.test.study.J112;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File(path("/video1.mp4"));
        long size = file.length();
        try (FileInputStream inputStream = new FileInputStream(file);
             FileOutputStream outputStream = new FileOutputStream(path("/video2.mp4"))
        ) {
            byte[] bytes = new byte[1024];
            int len, sum = 0;
            while ((len = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
                sum += len;
                System.out.println("文件已拷贝：" + new String(String.valueOf((1.0 * sum * 100 / size))).substring(0,5) +
                        "%");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String path(String str) {
        return "/Users/haonan/IdeaProjects/study/src/com/test/study/J112" + str;
    }
}
