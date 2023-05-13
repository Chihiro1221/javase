package com.test.study.collection;

import java.util.NoSuchElementException;

public class LinkedStack<T> {
    private final Node<T> head = new Node<>(null);

    public void push(T value) {
        Node<T> node = new Node<>(value);
        node.next = head.next;
        head.next = node;
    }

    public T pop(){
        if(isEmpty()) throw new NoSuchElementException("栈为空");
        Node<T> node = head.next;
        head.next = head.next.next;
        return node.value;
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    private static class Node<T> {
        public T value;
        public Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }
}
