package com.dubudiu.thread;

public class ThreadLoadTask {

//    static ThreadLocal<Integer> threadLocalCount = new ThreadLocal<>();
    static ThreadLocal<Integer> threadLocalCount = new InheritableThreadLocal<>();

    static void print(String name){
        System.out.println(name+":"+threadLocalCount.get());
    }

    public static void main(String[] args) {

        threadLocalCount.set(0);

        Thread threadA = new Thread(() -> {
           print("A");
           threadLocalCount.set(1);
           print("A");
           System.out.println("A线程结束");
        });

        Thread threadB = new Thread(() -> {
            print("B");
            threadLocalCount.set(2);
            print("B");
            System.out.println("B线程结束");
        });
        threadB.start();
        threadA.start();

        System.out.println("main:"+threadLocalCount.get());
    }


}
