package com.test.study.collection;

public class LinkedList<T> {
    private final Node<T> head = new Node<>(null);
    private int size = 0;

    private Node<T> findPrevious(int index) {
        Node<T> previous = head;
        while (index-- != 0) {
            previous = previous.next;
        }
        return previous;
    }

    public void insert(T value, int index) {
        if (index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException("插入位置非法，合法的插入位置为：0 ~ " + size);
        Node<T> node = new Node<>(value);
        Node<T> previous = findPrevious(index);
        node.next = previous.next;
        previous.next = node;
        ++size;
    }

    public T remove(int index) {
        if (index < 0 || index > size - 1)
            throw new ArrayIndexOutOfBoundsException("插入位置非法，合法的插入位置为：0 ~ " + (size - 1));
        Node<T> previous = findPrevious(index);
        Node<T> target = previous.next;
        previous.next = previous.next.next;
        --size;
        return target.value;
    }

    public T indexOf(int index) {
        if (index < 0 || index > size - 1)
            throw new ArrayIndexOutOfBoundsException("获取元素位置非法，合法的索引位置为：0 ~ " + (size - 1));
        Node<T> target = findPrevious(index).next;
        return target.value;
    }

    private static class Node<T> {
        public T value;
        public Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Node<T> node = head.next;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(node.value);
            stringBuilder.append(",");
            node = node.next;
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
