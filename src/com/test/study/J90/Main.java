package com.test.study.J90;

import com.test.study.collection.HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable<Integer> hashTable = new HashTable();
//        System.out.println(hashTable.contains("houdunren.com"));
//        hashTable.insert("houdunren.com");
//        System.out.println(hashTable.contains("houdunren.com"));
        for (int i = 0; i < 50; i++) {
            hashTable.insert(i);
        }
        System.out.println(hashTable.toString());

    }

}