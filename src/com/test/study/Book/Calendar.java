package com.test.study.Book;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Calendar {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int curMonth = now.getMonthValue();
        int curDay = now.getDayOfMonth();
        LocalDate date = now.minusDays(curDay - 1);
        int week = date.getDayOfWeek().getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < week; ++i) System.out.print("    ");
        while (date.getMonthValue() == curMonth) {
            int day = date.getDayOfMonth();
            System.out.printf("%3d", day);
            // 今天标记一个*号
            if (day == curDay) System.out.print("*");
            else System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
    }
}
