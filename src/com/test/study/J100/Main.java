package com.test.study.J100;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>((a,b) -> b-a);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(10);
        System.out.println(set);
    }

}