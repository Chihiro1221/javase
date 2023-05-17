package com.test.study.J111;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(path("/test.text"));
            FileWriter fileWriter = new FileWriter(path("/test2.text"))
        ){
            char[] c = new char[3];
            int len;
            while((len = fileReader.read(c)) != -1) fileWriter.write(c,0,len);
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String path(String str) {
        return "/Users/haonan/IdeaProjects/study/src/com/test/study/J111" + str;
    }
}
