package com.java.jvm.understandingJVM2.ch4;

import javax.sound.midi.Soundbank;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2017/12/28 19:40
 */
public class SynAddRunalbe implements Runnable {

    int a ,b;

    public SynAddRunalbe(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void run() {
        synchronized (Integer.valueOf(a)){
            synchronized (Integer.valueOf(b)){
                System.out.println(a + b);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new SynAddRunalbe(1,2)).start();
            new Thread(new SynAddRunalbe(2,1)).start();
        }
    }
}
