package com.dubudiu.thread;

public class WaitNotifyInterrupt {

    static Object object =new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread threadA = new Thread(() -> {
            System.out.println("----------开始---------");
            synchronized (object){
                try {
                    object.wait();
                    System.out.println("----------结束---------");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("--------我是谁,我从哪里来---------");
        threadA.start();
        Thread.sleep(1000);
        System.out.println("----interrupt Start-----");
        threadA.interrupt();
        System.out.println("----interrupt End-----");
    }
}
