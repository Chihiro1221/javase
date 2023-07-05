package com.test.study.Book;

import jdk.jfr.internal.OldObjectSample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOfTest {
    public static void main(String[] args) {
        String[] a = {"Tom", "Dick", "Harry"};
        a = (String[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        a = (String[]) badCopyOf(a, 10);
    }

    public static Object[] badCopyOf(Object[] a, int newLength) {
        Object[] b = new Object[newLength];
        System.arraycopy(a, 0, b, 0, Math.min(a.length, newLength));
        return b;
    }

    public static Object goodCopyOf(Object[] a, int newLength) {
        Class<? extends Object[]> cls = a.getClass();
        Class<?> componentType = cls.getComponentType();
        Object b = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, b, 0, Math.min(a.length, newLength));
        return b;
    }
}
