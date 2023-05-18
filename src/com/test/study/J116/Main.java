package com.test.study.J116;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        out.write("houdunren.com".getBytes());
        out.close();
        // 修改输出位置
        System.setOut(new PrintStream("/Users/haonan/IdeaProjects/study/src/com/test/study/J116/test.text"));
        System.out.println("houdunren.com哈哈哈哈");
    }

}
