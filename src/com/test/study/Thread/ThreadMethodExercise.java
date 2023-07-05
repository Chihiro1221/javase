package com.test.study.Thread;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        T5 t5 = new T5();
        Thread thread = new Thread(t5);
        for(int i = 1; i <= 10; ++i) {
            Thread.sleep(1000);
            System.out.println("houdunren.com "  +i);
            if(i == 5) {
                thread.start();
                thread.join();
            }
        }
    }
}

class T5 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; ++i) {
            try {
                Thread.sleep(1000);
                System.out.println("hdcms.com " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
