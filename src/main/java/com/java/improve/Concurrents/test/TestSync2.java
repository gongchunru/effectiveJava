package com.java.improve.Concurrents.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author gongchunru
 * @Package com.java.improve.Concurrents.test
 * @date 2017/10/16 22:53
 */
@Slf4j
public class TestSync2 implements Runnable{
    int b = 100;

    synchronized void m1() throws InterruptedException{
        System.out.println("m1:"+Thread.currentThread().getName()+" start");
        b = 1000;
        Thread.sleep(500);//6
        System.out.println("b="+b);
        System.out.println("m1:"+Thread.currentThread().getName()+" end");
    }

    synchronized void m2() throws InterruptedException{
        System.out.println("m2:"+Thread.currentThread().getName()+" start");
        Thread.sleep(2500);//5
        b = 2000;
        System.out.println("m2:"+Thread.currentThread().getName()+" end");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main:"+Thread.currentThread().getName());
        TestSync2 tt = new TestSync2();
        TestSync2 tt2 = new TestSync2();
        Thread t = new Thread(tt2);//1
        t.start();//2
        tt.m2();//3
        System.out.println("main thread b="+ tt.b);//4
        /*
        3 执行完执行m1  //这个说法不对

         */
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
