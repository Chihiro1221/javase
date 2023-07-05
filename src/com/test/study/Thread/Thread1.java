package com.test.study.Thread;

public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();

        System.out.println("主程序正常执行：" + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程i=" + i);
            Thread.sleep(1000);
        }
    }
}

class Cat extends Thread {
    @Override
    public void run() {
        int times = 0;
        while (true) {
            System.out.println("Hello World!" + (++times) + "子线程：" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80) return;
        }

    }
}
