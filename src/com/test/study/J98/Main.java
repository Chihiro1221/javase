package com.test.study.J98;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c");
//        Test test = new Test();
//        Iterator iterator = test.iterator();
//        while(iterator.hasNext()) System.out.println(iterator.next());
        ListIterator<String> stringListIterator = list.listIterator();
        while(stringListIterator.hasNext()) stringListIterator.next();
        while(stringListIterator.hasPrevious()) System.out.println(stringListIterator.previous());

    }

    public static class Test implements Iterable{

        @Override
        public Iterator iterator() {
            return new Iterator() {
                @Override
                public boolean hasNext() {
                    return true;
                }

                @Override
                public Object next() {
                    return "houdunren.com";
                }
            };
        }
    }

}