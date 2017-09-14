package com.java.improve.Concurrents;

import java.util.HashMap;

/**
 * Created by gongchunru
 * Date：2017/9/13.
 * Time：15:33
 */
public class IntegerLock {

//    static Integer i = 0;
    static volatile int i = 0;
//    static int i = 0;
    public static class AddThread extends Thread{
        public void run() {
            for (int k = 0; k < 1000; k++) {
                    i++;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        AddThread t1 = new AddThread();
        AddThread t2 = new AddThread();
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println(i);


        HashMap map = new HashMap();
        map.put(null,null);


    }

}
