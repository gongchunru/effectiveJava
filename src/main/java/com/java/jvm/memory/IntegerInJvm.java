package com.java.jvm.memory;

/**
 * @author gongchunru
 * @Package com.java.jvm.memory
 * @date 2017/7/2 17:37
 */
public class IntegerInJvm {
    public static void main(String[] args) {
        int a = -10;
        for (int i = 0; i < 32; i++){
            // 0x80000000?
            // 0100,0000,0000,0000,0000,0000,0000,0000
            // ?????????0
            int t = (a & 0x80000000 >>> i) >>> (31 - i);
            System.out.print(t);
        }
        System.out.println();
        //？？
        System.out.println(Integer.toBinaryString(a));
    }

}
