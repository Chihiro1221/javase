package com.test.study.Book;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date.toString());

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate of = LocalDate.of(1999, 12, 31);
        System.out.println(of.getYear());
        System.out.println(of.getMonthValue());
        System.out.println(of.getDayOfMonth());
        System.out.println();

        LocalDate localDate = of.plusDays(1000);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
    }
}
