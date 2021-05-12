package com.dubudiu.test.displacement;

public interface E  extends B,D{


    @Override
    default void test() {
        System.out.println("E");
    }
}
