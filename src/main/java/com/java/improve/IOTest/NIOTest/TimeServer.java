package com.java.improve.IOTest.NIOTest;

/**
 * Created by gongchunru on 2016/9/30.
 */
public class TimeServer {
    public static void main(String[] args) {
        int port = 8080;
        if (args!=null && args.length >0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }


    }
}
