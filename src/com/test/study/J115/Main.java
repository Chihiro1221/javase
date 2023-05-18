package com.test.study.J115;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "/Users/haonan/IdeaProjects/study/src/com/test/study/J115/test.text";
        String path1 = "/Users/haonan/IdeaProjects/study/src/com/test/study/J115/test2.text";
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "gbk"));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(path1), "gbk");
//        System.out.println(bufferedReader.readLine());
        outputStreamWriter.write("Hello World!");
//        bufferedReader.close();
        outputStreamWriter.close();
    }

}
