package com.test.study.J106;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("houdunren.com");
        Student s2 = new Student("houdunren.com");
        Map<Student, String> map = new HashMap<>();
        map.put(s1, "hadhfadsjfads");
        map.put(s2, "ahdfkajsdfkasdjl");
        System.out.println(map);
    }

    public static class Student {
        public String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
