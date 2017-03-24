package com.java.algorithm.test;

/**
 * Created by gongchunru on 2016/11/15.
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] data = new int[] { 5, 3, 6, 2, 1, 9, 4, 8, 7 };
        print(data);
        insertSort(data);
        print(data);
    }


    public static void insertSort(int[] data){
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j = i-1;

            if(temp<data[j]){
                while (j>=0&&data[j]>temp){
                    data[j+1] = data[j];
                    j--;
                }
                data[j+1] = temp;
                print(data);
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
