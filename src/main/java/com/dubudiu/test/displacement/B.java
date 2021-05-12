package com.dubudiu.test.displacement;

public interface B extends A{

    default void test (){
        System.out.println("B");
    };
}
