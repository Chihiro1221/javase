package com.test.study.J117;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("/Users/haonan/IdeaProjects/study/src/com/test/study" +
                "/J117/test.text"));
        writer.println("hahahah");
        writer.close();
    }
}
