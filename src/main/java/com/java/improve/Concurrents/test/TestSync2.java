package com.java.improve.Concurrents.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongchunru
 * @Package com.java.improve.Concurrents.test
 * @date 2017/10/16 22:53
 */
public class TestSync2 implements Runnable{
    int b = 100;

    synchronized void m1() throws InterruptedException{
        System.out.println("m1:"+Thread.currentThread().getName());
        b = 1000;
        Thread.sleep(500);//6
        System.out.println("b="+b);
    }

    synchronized void m2() throws InterruptedException{
        System.out.println("m2:"+Thread.currentThread().getName());
        Thread.sleep(250);//5
        b = 2000;
    }

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("main:"+Thread.currentThread().getName());
//        TestSync2 tt = new TestSync2();
//        Thread t = new Thread(tt);//1
//        t.start();//2
//
//        tt.m2();//3
//        System.out.println("main thread b="+ tt.b);//4


        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        for (String s : list) {
            if ("2".equals(s)){
                list.remove(s);
            }
        }




    }


    @Override
    public void run() {
        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
