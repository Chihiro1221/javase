package com.test.study.collection;

public class HashTable<T> {
    private int HashTableSize = 10;
    private Node<T>[] table = new Node[HashTableSize];

    private static class Node<T> {
        public T value;
        public Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    public HashTable() {
        for (int i = 0; i < HashTableSize; i++) {
            table[i] = new Node<>(null);
        }
    }

    private int hash(T object) {
        int hashCode = object.hashCode();
        return hashCode % HashTableSize;
    }

    public void insert(T object) {
        int index = hash(object);
        Node<T> node = new Node<>(object);
        node.next = table[index].next;
        table[index].next = node;
    }

    public boolean contains(T object) {
        int index = hash(object);
        Node<T> head = table[index].next;
        while(head != null){
            if(head.value == object) return true;
            head = head.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < HashTableSize; i++) {
            Node<T> head = table[i].next;
            while(head != null){
                stringBuilder.append(head.value).append("->");
                head = head.next;
            }
            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(">")).deleteCharAt(stringBuilder.lastIndexOf("-"));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
