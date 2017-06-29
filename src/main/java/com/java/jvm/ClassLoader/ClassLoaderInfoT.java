package com.java.jvm.ClassLoader;

/**
 * @author gongchunru
 * @Package com.java.jvm.ClassLoader
 * @date 2017/6/30 00:17
 * 打印类加载器
 */
public class ClassLoaderInfoT {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println("当前类加载器:"+classLoader);
        System.out.println("当前类的父类加载器(根加载器)："+classLoader.getParent());
        System.out.println("当前类的父类加载器（无）："+classLoader.getParent().getParent());
    }
}
