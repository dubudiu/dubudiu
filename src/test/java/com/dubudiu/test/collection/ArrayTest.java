package com.dubudiu.test.collection;

import com.dubudiu.entity.MyKey;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayTest {

    @Test
    public void setSizeNll(){
        Integer []  intArray = new Integer[6];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        intArray[5] = 6;
        Arrays.stream(intArray).forEach(System.out::print);
//        intArray[3] = null;
//        System.out.println();
//        Arrays.stream(intArray).forEach(System.out::print);
    }

    @Test
    public void defaultHashMapSize(){
        MyKey key = new MyKey("myKey");
        HashMap hashMap = new HashMap();
//        hashMap.put("","");
        hashMap.put(key,"value");
//        key.setName("nu");
        MyKey key2 = new MyKey("myKey");
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(key2));
    }
}
