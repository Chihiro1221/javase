package com.test.study.Thread;

public class Thread3 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        new Thread(t1).start();
        new Thread(t2).start();

        System.out.println("主线程：" + Thread.currentThread().getName());
    }
}

class T1 implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("t1 lalala " + (++count) + ' ' + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 8) break;
        }
    }
}

class T2 implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("t2 hahaha " + (++count) + ' ' + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 16) break;
        }
    }
}