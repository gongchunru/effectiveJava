package com.java.jvm;

/**
 * @author gongchunru
 * @create 2018-06-27 下午2:08
 */

class A{
    private static A a = new A();
    public  static int num1;
    public  static int num2 = 0;

    public A() {
        num1 ++;
        num2 ++;
        System.out.println("bbb");
    }

    public static A geta(){
        return a;
    }
}

public class StaticTest {
    public static void main(String[] args) {
        A a = A.geta();
        System.out.println("num1 : "+A.num1);
        System.out.println("num2 : "+A.num2);
    }
}




