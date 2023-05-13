package com.test.study.J84;
import com.test.study.collection.LinkedStack;

public class Main {
    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        for (int i = 0; i < 4; i++) {
            System.out.println(stack.pop());
        }
    }
}