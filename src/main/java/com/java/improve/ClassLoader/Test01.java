package com.java.improve.ClassLoader;

/**
 * Created by gongchunru on 2016/12/1.
 */
public class Test01 {

    public static void main(String[] args)
    {
        staticFunction();
    }

    static Test01 st = new Test01();

    static
    {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    Test01()
    {
        System.out.println("3");
        System.out.println("a="+a+",b="+b);
    }

    public static void staticFunction(){
        System.out.println("4");
    }

    int a=110;
    static int b =112;
}
