package com.test.study.Book;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        LinkedList<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");
        ListIterator<String> aItr = a.listIterator();
        Iterator<String> bItr = b.iterator();
        // merge the words from b into a
        while(bItr.hasNext()) {
            if(aItr.hasNext()) {
                aItr.next();
            }
            aItr.add(bItr.next());
        }

        System.out.println(a);
        bItr = b.iterator();
        while(bItr.hasNext()){
            bItr.next();
            if(bItr.hasNext()) {
                bItr.next();
                bItr.remove();
            };
        }

        System.out.println(b);
        a.removeAll(b);

        System.out.println(a);
    }
}
