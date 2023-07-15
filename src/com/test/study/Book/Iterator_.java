package com.test.study.Book;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterator_ {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("hdcms.com");
//        strings.add("houdunren.com");
//        strings.add("yahoo.com");
//        ListIterator<String> iterator = strings.listIterator();
//        iterator.add("taobao.com");
//        System.out.println(iterator.next());
////        iterator.remove();
//        while(iterator.hasNext()) System.out.println(iterator.next());

        LinkedList<String> strings = new LinkedList<>();
        strings.add("hdcms.com");
        strings.add("houdunren.com");
        strings.add("yahoo.com");
        ListIterator<String> it = strings.listIterator(1);
        ListIterator<String> it2 = strings.listIterator();
        System.out.println(it.next());
//        it.next();
//        it.set("haha");
//        for (String string : strings) {
//            System.out.println(string);
//        }


    }
}
