package com.java.jvm.ClassLoader;

/**
 * @author gongchunru
 * @Package com.java.jvm.ClassLoader
 * @date 2017/6/30 00:22
 * 子类的初始化过程和主动引用
 *  子类初始化： 先初始化父类
 *      input: java -XX:+TraceClassLoading 加载信息
 *
 *  https://github.com/JeffLi1993/jvm-core-learning-example/blob/master/src/org/jvmcore/classloader/InitMain.java
 *
 */

class Parent{
    static {
        System.out.println("Parent init");
    }
    public static int v = 100;
}

class Child extends Parent{
    static {
        System.out.println("Child init");
    }
}

public class InitMain {
    public static void main(String[] args) {
        new Child();
        System.out.println("=======");
        System.out.println(Child.v);
    }
}
