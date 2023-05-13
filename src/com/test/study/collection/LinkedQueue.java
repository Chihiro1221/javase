package com.test.study.collection;

import java.util.NoSuchElementException;

public class LinkedQueue<T> {
    private final Node<T> head = new Node<>(null);
    public void offer(T value){
        Node<T> node = head;
        while(node.next != null) node = node.next;
        node.next = new Node<>(value);
    }

    public T poll(){
        if(isEmpty()) throw new NoSuchElementException("队列为空");
        T value = head.next.value;
        head.next = head.next.next;
        return value;
    }

    public T getFirst(){
        if(isEmpty()) throw new NoSuchElementException("队列为空");
        return head.next.value;
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
