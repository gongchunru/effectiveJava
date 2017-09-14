package com.java.improve.callBack;

/**
 * @author gongchunru
 * @Package com.java.improve.callBack
 * @date 16/9/15 16:50
 */
public class Caller {

    public ICall call;

    public String setcallFun(ICall call){
        System.out.println("步1");
        System.out.println("步2");
        System.out.println("步3");
        this.call = call;
        call("步骤3 返回值");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("步4");
        return "最终值";
    }

    public void call(String a){

        this.call.method(a);
    }
}
