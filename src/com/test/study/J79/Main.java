package com.test.study.J79;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static Supplier<Student> studentSupplier = Student::new;
    static Consumer<Student> studentConsumer = student -> System.out.println("消费者：" + student.getName());
    static Function<Integer, String> stringFunction = Object::toString;
    static Predicate<Student> studentPredicate = (student) -> student.age >= 18;

    public static void main(java.lang.String[] args) {
        Student student = studentSupplier.get();
        System.out.println("供应者" + student.getName());
        studentConsumer.andThen(student1 -> System.out.println("消费者：后置操作")).accept(student);
        System.out.println(stringFunction.compose((Integer integer) -> integer * 10000).apply(10));
        System.out.println(stringFunction.andThen(str -> str + "结束哈哈哈哈！").apply(10));
        System.out.println(studentPredicate.and((Student student1) -> student1.name.contains("默认")).test(student));
    }

}