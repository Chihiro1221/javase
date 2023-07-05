package com.test.study.Thread;

/**
 * 死锁
 */
public class DeadLock {
    public static void main(String[] args) {
        Thread d1 = new Thread(new DeadLock_(true));
        d1.setName("A线程");
        Thread d2 = new Thread(new DeadLock_(false));
        d2.setName("B线程");
        d1.start();
        d2.start();
    }
}

class DeadLock_ implements Runnable {
    static Object o1 = new Object();
    static Object o2 = new Object();
    private boolean flag = false;

    public DeadLock_(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + " 进入 1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + " 进入 2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " 进入 3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + " 进入 4");
                }
            }
        }
    }
}
