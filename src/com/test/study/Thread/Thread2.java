package com.test.study.Thread;

public class Thread2 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        new Thread(dog).start();
//        System.out.println("主程序正常执行");
        Tiger tiger = new Tiger();
        new ThreadProxy(tiger).start();
    }
}

class Tiger implements Runnable {

    @Override
    public void run() {
        System.out.println("嗷呜~");
    }
}

class ThreadProxy implements Runnable {
    private Runnable target = null;

    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();
    }

    // 实际上是底层c++去实现并调用run
    private void start0() {
        run();
    }
}


class Dog implements Runnable {

    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println("汪汪汪!! " + (++count) + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 8) break;
        }
    }
}