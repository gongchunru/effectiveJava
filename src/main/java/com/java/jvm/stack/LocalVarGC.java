package com.java.jvm.stack;

/**
 * @author gongchunru
 * @Package com.java.jvm.stack
 * @date 2017/7/2 18:18
 *  * 打印GC信息
 *  input: -XX:+PrintGC
 */
public class LocalVarGC {
    public void localVarGc1(){
        byte[] bytes = new byte[6 * 1024 * 1024];
        System.gc();
    }

    public void localVarGc2(){
        byte[] bytes = new  byte[6 * 1024 * 1024];
        bytes = null;
        System.gc();
    }

    public void localVarGc3(){
        {
            byte[] bytes = new byte[6 * 1024 * 1024];
        }
        System.gc();
    }

    public void localVarGc4(){
        {
            byte[] bytes = new byte[6 * 1024 * 1024];
        }
        System.gc();
    }

    public void localVarGc5(){
        localVarGc1();
        System.gc();
    }

    public static void main(String[] args) {
        LocalVarGC ins = new LocalVarGC();
        ins.localVarGc5();
    }


}
