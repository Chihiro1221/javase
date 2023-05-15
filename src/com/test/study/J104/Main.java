package com.test.study.J104;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("aaaa", "Sadsa", "Sadsa", "xx", "add", "Xss", "Lbwnb"));
        list = list
                .stream()
                .filter(str -> str.length() > 3)
                .filter(str -> str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);

        Random random = new Random();
        IntSummaryStatistics statistics = random
                .ints(-100,100)
                .limit(10)
                .filter(i -> i>0)
                .sorted()
                .summaryStatistics();
        System.out.println(statistics.getMax());
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getSum());

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list2.stream().reduce((a, b) -> a + b).get());

    }
}