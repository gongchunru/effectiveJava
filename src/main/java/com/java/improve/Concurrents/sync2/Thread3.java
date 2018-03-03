package com.java.improve.Concurrents.sync2;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2018/2/28 16:13
 * 当一个线程访问object的一个synchronized(this)同步代码块时，
 * 另一个线程仍然可以访问该object中的非synchronized(this)同步代码块
 */
public class Thread3 {

    class Inner {


        public synchronized void mmm() {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
        }

        public void mmm2() {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }

            }
        }
    }

    private void m1(Inner inner) {
        synchronized (inner) {
            inner.mmm();
        }
    }

    private void m2(Inner inner) {
        inner.mmm2();
    }


    public static void main(String[] args) {
        final Thread3 myt3 = new Thread3();
        final Inner inner = myt3.new Inner();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                myt3.m1(inner);
            }
        }, "t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                myt3.m2(inner);
            }
        }, "t2");

        t1.start();
        t2.start();
    }
}
