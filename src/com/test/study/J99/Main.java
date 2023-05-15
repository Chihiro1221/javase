package com.test.study.J99;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<>((a,b) -> b-a);
        list.offer(1);
        list.offer(5);
        list.offer(10);
        System.out.println(list);
        for (int i = 0; i < 3; i++) {
            System.out.println(list.poll());
        }

    }

}