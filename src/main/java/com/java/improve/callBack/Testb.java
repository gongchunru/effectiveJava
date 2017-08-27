package com.java.improve.callBack;

/**
 * @author gongchunru
 * @Package com.java.improve.callBack
 * @date 16/9/15 17:14
 */
public class Testb implements ICall {

    protected static String aa = "这是一个字符串";

    @Override
    public void method(String a) {
        aa = a;
        System.out.println("  中间值  "+aa);
    }


    public static void main(String[] args) {

        Caller caller = new Caller();
        String a = caller.setcallFun(new Testb());
        System.out.println("" +
                "输出步骤中间值" + aa);
        System.out.println("输出最终值： " + a);
        caller.call("这是一个值");

    }

}
