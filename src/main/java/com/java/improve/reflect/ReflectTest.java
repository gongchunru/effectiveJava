package com.java.improve.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by gongchunru on 2017/3/20.
 * 反射测试类。
 *
 * @see java.lang.Class
 * @see java.lang.reflect.Constructor
 * @see java.lang.reflect.Field
 * @see java.lang.reflect.Method
 *
 *
 */
public class ReflectTest {

    public static void main(String[] args) {

        try {
            //这一步获取了类对象，
            Class clazz = Class.forName("com.java.improve.reflect.Person");

            //获取构造器
            Constructor constructor = clazz.getConstructor(String.class,Integer.class);

            Object object;

            try {
                //创建一个对象
                object = constructor.newInstance("ddad",12);

                //获取一个方法
                Method method = clazz.getMethod("foo");

                Method method2 = clazz.getMethod("foo2",String.class);


//                method.invoke(null);

                method2.invoke(object,"反射调用方法");


                try {
                    Field field = clazz.getDeclaredField("name");
                    field.setAccessible(true);
                    field.set(object,"小明");
                    System.out.println(field.get(object));
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }


        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println();


    }
}
