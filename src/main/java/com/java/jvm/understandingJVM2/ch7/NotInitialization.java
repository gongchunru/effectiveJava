package com.java.jvm.understandingJVM2.ch7;

/**
 * Created by gongchunru
 * Date：2017/7/3.
 * Time：18:59
 * 编译阶段会存在调用类的常量池中，本质上并没有引用到定义常量的类，不会出发定义常量的类的初始化。
 */

class ConstClass{
    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLOWORLD = "hello world!";
}

public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }
}
