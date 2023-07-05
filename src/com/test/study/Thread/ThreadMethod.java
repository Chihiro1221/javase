package com.test.study.Thread;

public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        T3 t3 = new T3();
        t3.setName("张三");
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("主线程 hdcms.com " + (i + 1));
        }

        t3.interrupt();
    }
}


class T3 extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 1; i <= 100; ++i) {
                System.out.println(Thread.currentThread().getName() + " houdunren.com " + i);
            }
            try {
                System.out.println("程序休眠中...");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println("程序被中断...");
//                throw new RuntimeException(e);
            }
        }
    }
}