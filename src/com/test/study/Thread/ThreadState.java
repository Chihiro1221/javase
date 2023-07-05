package com.test.study.Thread;

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new T7());
        System.out.println("线程状态：" + thread.getState());
        thread.start();

        while (Thread.State.TERMINATED != thread.getState()) {
            System.out.println("线程状态：" + thread.getState());
            Thread.sleep(1000);
        }
    }
}

class T7 implements Runnable {
    @Override
    public void run() {
        while (true) {
            for (int i = 1; i <= 10; ++i) {
                try {
                    Thread.sleep(1000);
                    System.out.println("子线程 houdunren.com " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            return;
        }
    }
}
