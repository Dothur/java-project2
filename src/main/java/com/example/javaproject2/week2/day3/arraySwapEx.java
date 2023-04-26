package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class arraySwapEx {
    public static void ascendingSwap(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8, 7, 6};

        ascendingSwap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
