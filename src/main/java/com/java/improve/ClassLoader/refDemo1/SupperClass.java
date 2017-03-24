package com.java.improve.ClassLoader.refDemo1;

/**
 * Created by gongchunru on 2016/12/1.
 */
public class SupperClass {
    static {
        System.out.println("Sup init!");
    }

    public static int value = 123;
}
