package com.test.study.J101;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "houdunren.com");
        System.out.println(map.put(1, "hdmcs.com"));
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        });
    }

}