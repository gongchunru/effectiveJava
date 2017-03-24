package com.java.algorithm.test;

/**
 * Created by gongchunru on 2016/9/12.
 *
 *
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
        prit(data);
        sort(data);
        prit(data);

    }

    public static void swap(int[] data,int i,int j){
        if (i==j) return;

        data[i] = data[i]+data[j];
        data[j] = data[i]-data[j];
        data[i] = data[i]-data[j];

    }

    public static void sort(int[] data){
        for (int i = 0; i < data.length-1; i++) {
            int minIndex = i;//缓存最小值的索引。
            for (int j = i+1; j <data.length ; j++) {
                if (data[j]<data[minIndex]){
                    minIndex = j;//只要有比当前最小值的索引，我们就替换为当前的最小值索引。
                }
            }

            if(minIndex!=i){
                swap(data,i,minIndex);
                prit(data);
            }
        }
    }


    public static void prit(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");
        }
        System.out.println();
    }

}
