package com.java.improve.Concurrents;

import java.util.Vector;

/**
 * Created by gongchunru
 * Date：2017/9/13.
 * Time：18:41
 */
public class VectorTest {

    private Vector<Integer> vector = new Vector<Integer>();

    public void remove(){
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < vector.size(); i++) {
                    vector.remove(i);
                }
            }
        }.start();
    }

    public void print(){
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < vector.size(); i++) {
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(vector.get(i));
                }
            }
        }.start();
    }

    public void add(int data){
        vector.add(data);
    }

    public static void main(String[] args) {
        VectorTest test = new VectorTest();

        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 10; i++) {
                test.add(i);
            }
            test.remove();
            test.print();
        }
    }




}
