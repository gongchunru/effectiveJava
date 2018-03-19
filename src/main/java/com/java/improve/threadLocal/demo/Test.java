package com.java.improve.threadLocal.demo;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2018/3/1 17:36
 */
public class Test {



    public static void main(String[] args) {
        SequenceNumber sn = new SequenceNumber();
        // 3个线程共享sn，各自产生序列号
        MyThread t1 = new MyThread(sn);
        MyThread t2 = new MyThread(sn);
        MyThread t3 = new MyThread(sn);
        t1.start();
        t2.start();
        t3.start();

        sn.remove();

    }

}
