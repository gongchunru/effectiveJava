package com.java.algorithm.test;

/**
 * Created by gongchunru on 2016/11/15.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] data = new int[]{5, 3, 6, 2, 1, 9, 4, 8, 7};
        print(data);
        bubbleSort(data);
        System.out.println("排序后的数组");
        print(data);
    }

    public static void swap(int[] data, int i, int j) {
        if (i == j) {
            return;
        }
        data[i] = data[i] + data[j];
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }


    public static void bubbleSort(int[] data){
        for (int i = 0; i <data.length-1 ; i++) {
            for (int j = i+1; j < data.length; j++) {
                if (data[i]>data[j]){
                    swap(data,i,j);
                    print(data);
                }
            }
        }
    }


    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }
}
