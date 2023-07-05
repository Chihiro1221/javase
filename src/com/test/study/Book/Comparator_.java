package com.test.study.Book;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator_ {
    public static void main(String[] args) {
        String[] ss = {"Mary", "Paul", "Peter"};
        Arrays.sort(ss, new LengthComparator());

        System.out.println(Arrays.toString(ss));
    }
}

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
