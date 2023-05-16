package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        for (int i = 0; i < arr.length - 1; i++) {
            int targetValue = arr[i];
            int targetidx = i;
            for (int j = 1 + i; j < arr.length; j++) {
                if (targetValue > arr[j]) {
                    targetValue = arr[j];
                    targetidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[targetidx];
            arr[targetidx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
