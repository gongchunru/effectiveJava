package com.java.improve.Concurrents;

/**
 * Created by gongchunru
 * Date：2017/9/13.
 * Time：18:57
 * 一个死锁的例子
 *
 */
public class DeadLock {

    /** A锁 */
    private static String A = "A";

    /** B锁 */
    private static String B = "B";

    public static void main(String[] args) {
        new  DeadLock().deadLock();
    }


    public void deadLock(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A){
                    System.out.println("t1   A..");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (B){
                        System.out.printf("Thread1...");
                    }

                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B){
                    System.out.println("t2   B...");
                    synchronized (A){
                        System.out.printf("Thread2...");
                    }
                }
            }
        });

        t1.start();
        t2.start();



    }



}
