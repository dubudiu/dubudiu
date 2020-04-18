package com.dubudiu.thread;

public class RunnableTask implements Runnable {

    @Override
    public void run() {
        System.out.println("子线程");
    }

    public static void main(String[] args) {
        RunnableTask runnableTask = new RunnableTask();
        new Thread(runnableTask).start();
        new Thread(runnableTask).start();
    }
}
