package test;

import java.util.Date;
import java.util.concurrent.ExecutionException;

/**
 * Created by gongchunru
 * Date：2017/7/7.
 * Time：14:57
 */
public class WaitAndSleep {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() ->{

            synchronized (WaitAndSleep.class){
                try {
                    System.out.println(new Date() + "Thread is running");
                    WaitAndSleep.class.wait();
                    System.out.println(new Date() + " Thread1 ended");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


        });

        thread1.start();

        Thread thread2 = new Thread(()-> {
            synchronized (WaitAndSleep.class) {

                try {
                    System.out.println(new Date() + " Thread2 is running");
                    WaitAndSleep.class.notify();
                    // Don't use sleep method to avoid confusing
                    for (long i = 0; i < 200000; i++) {
                        for (long j = 0; j < 100000; j++) {
                        }
                    }
                    System.out.println(new Date() + " Thread2 release lock");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }

            for (long i = 0; i < 200000; i++) {
                for (long j = 0; j < 100000; j++) {
                }
            }
            System.out.println(new Date() + " Thread2 ended");

        });

        // Don't use sleep method to avoid confusing
        for(long i = 0; i < 200000; i++) {
            for(long j = 0; j < 100000; j++) {}
        }
        thread2.start();

    }

}
