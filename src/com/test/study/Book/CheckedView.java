package com.test.study.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedView {
    public static void main(String[] args) {
        // unchecked list
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hah");
        strings.add("lala");
        ArrayList rawListr = strings;
        rawListr.add(LocalDate.of(1991,12,21));
        System.out.println(rawListr);
        // checked list
        List<String> checkedList = Collections.checkedList(strings, String.class);
//        checkedList.add(LocalDate.of(1991,12,21)); // an error
    }
}
