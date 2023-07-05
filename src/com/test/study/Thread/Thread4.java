package com.test.study.Thread;

public class Thread4 {
    public static void main(String[] args) {
        // 使用继承方式
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
        // 使用实现接口方式
//        SellTicket02 sellTicket02 = new SellTicket02();
//        Thread thread01 = new Thread(sellTicket02);
//        Thread thread02 = new Thread(sellTicket02);
//        Thread thread03 = new Thread(sellTicket02);
//        thread01.start();
//        thread02.start();
//        thread03.start();
        // 使用synchronized处理超卖情况

        SellTicket03 sellTicket03 = new SellTicket03();
        Thread thread01 = new Thread(sellTicket03);
        Thread thread02 = new Thread(sellTicket03);
        Thread thread03 = new Thread(sellTicket03);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}

class SellTicket01 extends Thread {
    private static int num = 100;

    @Override
    public void run() {
        while (true) {
            if (num <= 0) {
                System.out.println("票已售完...");
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("售票窗口:" + Thread.currentThread().getName() + "，成功售票！还剩余" + (--num) + "张");
        }
    }
}

class SellTicket02 implements Runnable {
    private int num = 100;

    @Override
    public void run() {
        while (true) {
            if (num <= 0) {
                System.out.println("票已售完...");
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("售票窗口:" + Thread.currentThread().getName() + "，成功售票！还剩余" + (--num) + "张");
        }
    }
}

class SellTicket03 implements Runnable {
    private int num = 100;
    private boolean loop = true;
    Object object = new Object();

    public static void m1() {
        synchronized (SellTicket03.class) {
            System.out.println("hello");
        }
    }

    // synchronized同一时间只允许一个线程
    public /*synchronized*/ void sell() {
        synchronized (object) {
            if (num <= 0) {
                System.out.println("票已售完...");
                loop = false;
                return;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("售票窗口:" + Thread.currentThread().getName() + "，成功售票！还剩余" + (--num) + "张");
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}