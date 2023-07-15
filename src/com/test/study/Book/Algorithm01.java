package com.test.study.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithm01 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 1;i <= 49; ++i) nums.add(i);
        Collections.shuffle(nums);
        List<Integer> integers = nums.subList(0, 6);
        System.out.println(integers);
        Collections.sort(nums);

        System.out.println(nums);
    }
}
