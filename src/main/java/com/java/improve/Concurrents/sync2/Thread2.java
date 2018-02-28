package com.java.improve.Concurrents.sync2;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2018/2/28 16:13
 * 当一个线程访问object的一个synchronized(this)同步代码块时，
 * 另一个线程仍然可以访问该object中的非synchronized(this)同步代码块
 */
public class Thread2 {

    public synchronized  void mmm() {
//        synchronized (this) {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
//        }
    }

    public synchronized  void mmm2() {
        int i = 5;
        while (i-- > 0) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }

        }
    }


    public static void main(String[] args) {
        final Thread2 myt2 = new Thread2();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                myt2.mmm();
            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                myt2.mmm2();
            }
        },"t2");

        t1.start();
        t2.start();
    }
}
