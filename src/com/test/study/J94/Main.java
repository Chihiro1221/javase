package com.test.study.J94;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("哈哈","拉拉","嘎嘎"));
        list.remove(0);
        System.out.println(list);
    }

}