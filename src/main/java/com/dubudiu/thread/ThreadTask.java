package com.dubudiu.thread;

public class ThreadTask {

    public static class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println("子线程");
        }
    }


    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
