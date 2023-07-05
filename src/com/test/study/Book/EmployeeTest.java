package com.test.study.Book;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("张三", 75000, 2022, 12, 21);
        Employee e2 = new Employee("李四", 50000, 2022, 12, 21);
        Employee e3 = new Employee("王5️⃣", 100000, 2022, 12, 21);
        Employee[] employees = new Employee[]{e1, e2, e3};
        Arrays.sort(employees, (c, p) -> (int) (p.getSalary() - c.getSalary()));

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Employee.test();
    }
}

class Employee extends Object implements Comparable<Employee>, Named, Person, Cloneable {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        Objects.requireNonNull(name, "the name doesn't exist!");
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public Employee getBuddy() {
        return new Employee("default", 0, 0, 0, 0);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    @Override
    public String getName() {
        return Named.super.getName();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void test() {
        System.out.println(new Object() {
        }.getClass().getEnclosingClass());
    }
}


class Manager extends Employee {

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    @Override
    public Manager getBuddy() {
        return new Manager("default", 0, 0, 0, 0);
    }
}