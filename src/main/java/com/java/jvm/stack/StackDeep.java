package com.java.jvm.stack;

/**
 * @author gongchunru
 * @Package com.java.jvm.stack
 * @date 2017/7/2 21:57
 *  * 堆溢出的理解
 *  input: // -Xss128K
 */
public class StackDeep {
    private static int count = 0;
    public static void recursion(){
        count ++;
        recursion();
    }


    public static void recursion(long a,long b, long c){
        long e = 1 , f = 2, g = 3, h = 4, j = 5, k = 6, l = 7, q = 8, w = 10, r = 9;
        count ++;
        recursion(a, b, c);
    }

    public static void main(String[] args) {
        try {
            recursion();
        } catch (Exception e) {
            System.out.println("counts = " + count);
            e.printStackTrace();
        }
    }

}
