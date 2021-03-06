package com.java.jvm.understandingJVM2.ch4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2017/12/28 18:31
 * 内存占位符，一个OOMObject 大约占64kB
 *
 * 参数设置：
 * -Xms100m -Xmx100m -XX:+UseSerialGC
 *
 */
public class OOMObject {

    public byte[] placeholder = new byte[64 * 1024];


    public static void fillHeap(int num) throws InterruptedException{
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i = 0; i < num; i++) {

            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }



    public static void main(String[] args) throws Exception{
        fillHeap(1000);
    }
}



