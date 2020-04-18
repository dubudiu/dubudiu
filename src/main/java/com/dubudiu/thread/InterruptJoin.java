package com.dubudiu.thread;

public class InterruptJoin {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted())
                System.out.println(Thread.currentThread() + "hello");
        });

        thread.start();
        Thread.sleep(100);
        thread.interrupt();
        thread.join();
        System.out.println("结束");
    }
}
