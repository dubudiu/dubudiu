package com.dubudiu.test;

public interface B extends A{

    default void test (){
        System.out.println("B");
    };
}
