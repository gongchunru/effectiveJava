package com.java.improve.ClassLoader;

/**
 * Created by gongchunru on 2016/12/1.
 */
public class ThreadTest {
    public static void main(String[] args) {

        String s=null;

        System.out.println(s);
        Thread t = new Thread(){
            @Override
            public void run() {
                pong();
            }
        };
        t.start();
        System.out.println("ping");
    }


    static void pong(){
        System.out.println("pong");
    }

}
