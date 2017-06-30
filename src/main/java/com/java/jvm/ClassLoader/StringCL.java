package com.java.jvm.ClassLoader;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author gongchunru
 * @Package com.java.jvm.ClassLoader
 * @date 2017/6/30 22:52
 * 类加载 Class.forName
 */
public class StringCL {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clzStr = Class.forName("java.lang.String");
        //返回对象方法数组
        Method[] methods = clzStr.getDeclaredMethods();
        for (Method method : methods) {
            //获取修饰符标志的字符串
            String mod = Modifier.toString(method.getModifiers());
            System.out.println(mod + " " + method.getName() + "(");
            Class<?>[] ps = method.getParameterTypes();
            if (ps.length == 0){
                System.out.println(")");
            }
            for (int i = 0; i < ps.length; i++) {
                char end = i == ps.length - 1 ? ')':',';
                System.out.println(ps[i].getSimpleName() + end);
            }
            System.out.println();
        }

    }

}
