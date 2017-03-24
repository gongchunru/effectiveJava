package com.java.improve.ClassLoader.refDemo1;

/**
 * Created by gongchunru on 2016/12/1.
 *
 * 对于静态字段，只有直接定义这个字段的类才会被初始化，
 * 因此，通过子类来调用父类的初始化不会触发子类的初始化。
 */
public class NotInitialization {
    public static void main(String[] args) {
//        System.out.println(SubClass.value);


        //Test02
        //通过数组定义引用类，不会触发此类的初始化。

        SupperClass[] sca = new SupperClass[10];
    }
}
