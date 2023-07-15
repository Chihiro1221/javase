package com.test.study.Book;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        long totalTime = 0;

        try(Scanner scanner = new Scanner(System.in)){
            while(scanner.hasNext()) {
                String next = scanner.next();
                long callTime = System.currentTimeMillis();
                words.add(next);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }

        }
        Iterator<String> iterator = words.iterator();
        for(int i = 0; i < 20 && iterator.hasNext(); ++i) {
            System.out.println(iterator.next());
        }

        System.out.println("...");
        System.out.println(words.size() + "distinct words." + "totalTime " + totalTime);
    }
}
