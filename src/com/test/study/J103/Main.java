package com.test.study.J103;

import org.omg.CORBA.CharSeqHelper;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        List<Student> students = new LinkedList(Arrays.asList(
                new Student("yoni", "English", 80),
                new Student("yoni", "Chiness", 98),
                new Student("yoni", "Math", 95),
                new Student("taohai.wang", "English", 50),
                new Student("taohai.wang", "Chiness", 72),
                new Student("taohai.wang", "Math", 41),
                new Student("Seely", "English", 88),
                new Student("Seely", "Chiness", 89),
                new Student("Seely", "Math", 92)
        ));
        Map<String, Integer> scoreMap = new HashMap<>();
        students.forEach((stu) -> scoreMap.merge(stu.getName(), stu.getScore(), Integer::sum));
        scoreMap.forEach((key, value) -> System.out.println(key + " -> " + value));
        map.put(1, "houdunren.com");
        map.put(2, "hdcms.com");
        map.forEach((key, value) -> map.compute(key, (k, v) -> "https://" + v));
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    public static class Student {
        private final String name;
        private final String type;
        private final int score;

        public Student(String name, String type, int score) {
            this.name = name;
            this.type = type;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public String getType() {
            return type;
        }

    }
}