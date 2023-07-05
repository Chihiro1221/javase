package com.test.study.Thread;

public class ThreadMethod2 {
    public static void main(String[] args) throws InterruptedException {
        T4 t4 = new T4();
        t4.start();
        for (int i = 0; i < 20; ++i) {
            Thread.sleep(1000);
            System.out.println("主线程 houdunren.com " + (i + 1));
            if(i == 5) {
                // 让给子线程，先让子线程执行完
//                t4.join();
                // 礼让给子线程，但不一定成功
//                Thread.yield();
            }
        }
    }
}


class T4 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; ++i) {
            try {
                Thread.sleep(1000);
                System.out.println("子线程 hdcms.com " + (1 + i));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}