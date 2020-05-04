package com.dubudiu.test;

public interface D  extends A{

   default void test(){
       System.out.println("D");
   };
}
