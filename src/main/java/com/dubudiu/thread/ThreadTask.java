package com.dubudiu.thread;

import java.util.concurrent.atomic.AtomicReference;

public class ThreadTask {

    public static class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println("子线程");
        }
    }


    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
        AtomicReference<Integer> count = new AtomicReference<>(0);

        Thread thread1 = new Thread(() -> {
            for(int i = 0; i< 10; i++){
                count.getAndSet(count.get() + 1);
                System.out.println("1："+count.get());
            }
//            System.out.println("1："+count.get());
        });
        Thread thread2 = new Thread(() -> {
            for(int i = 0; i< 10; i++){
                count.getAndSet(count.get() + 1);
                System.out.println("2："+count.get());
            }
//            System.out.println("2："+count.get());
        });
        Thread thread3 = new Thread(() -> {
            for(int i = 0; i< 10; i++){
                count.getAndSet(count.get() + 1);
                System.out.println("3："+count.get());
            }
            System.out.println("3："+count.get());
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
