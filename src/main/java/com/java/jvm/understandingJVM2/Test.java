package com.java.jvm.understandingJVM2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by gongchunru
 * Date：2017/7/6.
 * Time：8:39
 */
public class Test {

    public static void main(String[] args) {
//        HashMap<String,Object> a = new HashMap<>();

        System.out.println(tableSizeFor(14));

    }

    public static void dvi(BigDecimal amount){
        List<BigDecimal> list = new ArrayList<>();
        list.add(new BigDecimal(100));
        list.add(new BigDecimal(200));
        list.add(new BigDecimal(299));


        BigDecimal sum = list.get(0).add(list.get(1)).add(list.get(2));
        BigDecimal disAmount = new BigDecimal(0);
        BigDecimal count = BigDecimal.ZERO;

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                disAmount = amount.subtract(count);
            }else {
                disAmount = amount.multiply(list.get(i)).divide(sum,0,BigDecimal.ROUND_HALF_EVEN);
            }
            count = count.add(disAmount);

            System.out.println("第"+i+"次循环，分到的钱"+disAmount);
        }
    }

    static final int tableSizeFor(int cap) {
                            //0000 1110
        int n = cap - 1;    //0000 1101
        n |= n >>> 1;
                            //0000 0110
                            //0000 1111

        n |= n >>> 2;
                            //0000 0011
                            //0000 1111
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return  n + 1;
    }

}
