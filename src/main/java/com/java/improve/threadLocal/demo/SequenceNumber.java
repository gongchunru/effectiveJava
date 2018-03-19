package com.java.improve.threadLocal.demo;

/**
 * @author gongchunru
 * @email gongchunru@gmail.com
 * Date：2018/3/1 17:36
 */
public class SequenceNumber {
    // 通过匿名内部类覆盖ThreadLocal的initialValue()方法，指定初始值
    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
        @Override
        public Integer initialValue() {
            return 0;
        }
    };

    // 获取下一个序列值
    public int getNextNum() {
        seqNum.set(seqNum.get() + 1);//这里set函数，在内部实现的时候，key是当前的threadlocal
        return seqNum.get();//get的时候，也是用了当前的threadlocal作为key去取出value
    }


    public void remove(){
        seqNum.remove();
    }
}
