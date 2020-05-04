package com.dubudiu.test;

public interface E  extends B,D{


    @Override
    default void test() {
        System.out.println("E");
    }
}
