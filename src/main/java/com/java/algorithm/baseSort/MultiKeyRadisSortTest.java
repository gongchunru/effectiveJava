package com.java.algorithm.baseSort;

import java.util.Arrays;

/**
 * Created by gongchunru on 2016/8/26.
 */
public class MultiKeyRadisSortTest {
    public static void main(String[] args) {
        int[] data = new int[] { 1100, 192, 221, 12, 23 };
        print(data);
        radixSort(data, 10, 4);
        System.out.println("排序后的数组：");
        print(data);
    }

    public static void radixSort(int[] data,int radix,int d){
        //缓存数组
        int[] tmp = new int[data.length];
        //buckets用户记录待排序元素的信息
        //buckets数组定义了max-min个桶
        int[] buckets = new int[radix];

        for (int i = 0,rate=1; i < d; i++) {
            //重置count数组，开始统计下一个关键字
            Arrays.fill(buckets,0);
            //将data中的元素完全复制到tmp数组中
            System.arraycopy(data,0,tmp,0,data.length);

            //计算每个待排序数据的子关键字
            for (int j = 0; j < data.length; j++) {
                int subKey = (tmp[j]/rate) % radix;
                buckets[subKey]++;
            }

            for (int j = 1; j < radix; j++) {
                buckets[j] = buckets[j] + buckets[j-1];
            }
            //按子关键字对指定的数据进行排序

            for (int m = data.length-1; m >=0 ; m--) {
                int subKey = (tmp[m]/rate)%radix;
                data[--buckets[subKey]] = tmp[m];
            }
            rate *= radix;
        }
    }


    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }
}
