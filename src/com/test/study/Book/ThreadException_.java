package com.test.study.Book;

import java.util.Collection;

public class ThreadException_ {
    public static void main(String[] args) {
        Thread thread = new Thread(Task.asRunable(() -> {
            Thread.sleep(1000);
            System.out.println("Hello World!");
            throw new Exception("Check this out!");
        }));
        thread.start();
    }
}


interface Task {
    void run() throws Exception;

    static <T extends Throwable> void throwAs(Throwable t) throws T {
        throw (T) t;
    }

    static Runnable asRunable(Task task) {
        return () -> {
            try {
                task.run();
            } catch (Exception e) {
                Task.<RuntimeException>throwAs(e);
            }
        };
    }
}