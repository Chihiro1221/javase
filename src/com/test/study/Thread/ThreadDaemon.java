package com.test.study.Thread;

public class ThreadDaemon {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new T6());
        thread.setDaemon(true);
        thread.start();

        for (int i = 1; i <= 5; ++i) {
            Thread.sleep(1000);
            System.out.println("主线程 houdunren.com...");
        }
    }

}

class T6 implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("子线程 hdmcs.com...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
