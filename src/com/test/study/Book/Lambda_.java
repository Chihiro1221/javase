package com.test.study.Book;

import javax.swing.*;
import java.util.Arrays;

public class Lambda_ {
    public static void main(String[] args) {
        String[] ss = {"Mary", "Paul", "Peter"};
        Arrays.sort(ss, (o1, o2) -> o1.length() - o2.length());

        Timer timer = new Timer(1000, event -> System.out.println("The time is " + new Date().toString()));
        timer.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
    }
}
