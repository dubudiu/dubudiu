package com.dubudiu.thread;

public class WaitNotifyall {

    static Object object = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread threadA = new Thread(() -> {
            System.out.println("启动线程A");
            synchronized (object){
                try {
                    System.out.println("A线程执行wait前");
                    object.wait();
                    System.out.println("A线程执行wait后");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadB = new Thread(() -> {
            System.out.println("启动线程B");
            synchronized (object){
                try {
                    System.out.println("B线程执行wait前");
                    object.wait();
                    System.out.println("B线程执行wait后");                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadD = new Thread(() -> {
            System.out.println("启动线程D");
            synchronized (object){
                try {
                    System.out.println("D线程执行wait前");
                    object.wait();
                    System.out.println("D线程执行wait后");                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadC = new Thread(() -> {
            System.out.println("启动线程C");
            synchronized (object){
                System.out.println("线程C执行Notify前");
                object.notifyAll();
                System.out.println("线程C执行Notify后");
            }
        });

        threadA.start();
        threadB.start();
        Thread.sleep(1000);
        threadC.start();

        threadA.join();
        threadB.join();
        threadC.join();
        System.out.println("执行结束");
    }
}
