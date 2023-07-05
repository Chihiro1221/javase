package com.test.study.Properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/com/test/study/Properties/mysql.properties"));
        properties.list(System.out);

        String user = properties.getProperty("user");
        String psd = properties.getProperty("psd");
        System.out.println(user + "->" + psd);
    }
}
