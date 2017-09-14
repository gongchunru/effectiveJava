package com.java.TheArtOfJavaConcProgramming.ch4;

import java.util.concurrent.TimeUnit;

/**
 * Created by gongchunru on 2016/11/4.
 */
public class Shutdown {
    public static void main(String[] args) throws Exception {
        Runner r = new Runner();
        Thread countThread = new Thread(r,"CountThread1");
        countThread.start();
        //睡眠1秒，main线程对CountThread进行中断，使CountThread
        TimeUnit.SECONDS.sleep(1);
        countThread.interrupt();

        Runner two = new Runner();
        countThread = new Thread(two,"CountThread2");
        countThread.start();
        TimeUnit.SECONDS.sleep(1);
        two.cancle();
    }


    private static class Runner implements Runnable{

        private long i;
        private volatile boolean on = true;
        @Override
        public void run() {
                while (on && !Thread.currentThread().isInterrupted()){
                    i++;
                 }
            System.out.println("Count i="+i);
        }
        public void cancle(){
            on = false;
        }
    }
}
