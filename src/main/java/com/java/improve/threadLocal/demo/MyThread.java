package com.java.improve.threadLocal.demo;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2018/3/1 17:35
 */
public class MyThread extends Thread{
    private SequenceNumber sn;

    public MyThread(SequenceNumber sn) {
        this.sn = sn;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            // 每个线程打出3个序列值
            System.out.println("thread[" + Thread.currentThread().getName()
                    + "] sn[" + sn.getNextNum() + "]");
        }

    }
}
