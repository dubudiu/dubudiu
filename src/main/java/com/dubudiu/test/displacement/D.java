package com.dubudiu.test.displacement;

public interface D  extends A{

   default void test(){
       System.out.println("D");
   };
}
