package com.java.jvm.understandingJVM2.ch7;

/**
 * Created by gongchunru
 * Date：2017/7/3.
 * Time：13:36
 *
 * 1 ：
 * 对于静态字段，只有直接定义这个字段的类，才会被初始化，
 * 因此，通过子类来引用父类中定义的静态字段，只会出发父类的初始化而不会出发子类的初始化。
 *
 * 2：
 * 通过数组定义来引用类，不会出发此类的初始化。
 *
 */


public class Passivity {

    public static void main(String[] args) {

        // 1
        System.out.println(SubClass.value);

        //2
        SuperClass[] sca = new SuperClass[10];
        System.out.println(sca.length);
    }

}

class SuperClass{
    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}

class SubClass extends SuperClass{
    static {
        System.out.println("SubClass init!");
    }
}
