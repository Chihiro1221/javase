package com.test.study.Book;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee("张三", 75000, 2020, 12, 21);
        Object clone = employee.clone();
        System.out.println(clone);
    }
}
