package com.test.study.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EnumSetAndMapTest {
    public static void main(String[] args) {
        ArrayList<String> staff = new ArrayList<>();
        staff.add("tommy");
        staff.add("arthur");
        staff.add("john");
        List<String> sub = staff.subList(0, 2);
        sub.clear();
        System.out.println(staff);

    }
}
