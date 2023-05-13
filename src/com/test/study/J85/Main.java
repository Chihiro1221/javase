package com.test.study.J85;

import com.test.study.collection.LinkedQueue;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<String> list = new LinkedQueue();
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        for (int i = 0; i < 4; i++) {
            System.out.println(list.poll());
        }
    }
}