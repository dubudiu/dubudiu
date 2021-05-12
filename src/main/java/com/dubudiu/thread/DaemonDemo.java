package com.dubudiu.thread;

public class DaemonDemo {

    public static void main(String[] args) {
        Thread thread= new Thread(() -> {
            for (;;){}
        });
//        thread.setDaemon(true);
        thread.start();
        System.out.printf("------线程结束------");
    }
}
