package com.java.jvm.heap;

/**
 * @author gongchunru
 * @Package com.java.jvm.heap
 * @date 2017/7/2 17:29
 * 打印堆内存
 *  input: java -Xmx33m org.jvmcore.heap.JvmXmxArgs a b
 *  打印始终小于 33M , 因为GC在不同区域采用不同回收算法，可用内存的减少为了其使用空间换时间的策略。
 */
public class JvmXmxArgs {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("参数为:"+arg);
            //堆内存
            System.out.println("-Xmx:"+Runtime.getRuntime().maxMemory()/1024/1024 + "m");
        }
    }

}
