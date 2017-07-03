package com.java.jvm.memory;

/**
 * @author gongchunru
 * @Package com.java.jvm.memory
 * @date 2017/7/2 17:35
 * 输出浮点数在虚拟机的实际表示
 */
public class FloatInJvm {
    public static void main(String[] args) {
        float a = -5;
        //输出-5的补码，即虚拟机内部实际表示
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(a)));
    }

}
