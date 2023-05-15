package com.example.javaproject2.week5.day1;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort01 {

    public int[] sortAround(int[] arr, int until){
        for (int i = 0; i < until; i++) {
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }
    public int[] sort(int[] arr){ // 반복하는 기능을 sort()로 분리
        for (int i = 1; i <= arr.length; i++) {
            arr = sortAround(arr, arr.length - i);
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort01 bubbleSort01 = new BubbleSort01();
        int[] arr = {7, 2, 3, 9, 28, 1};
        arr = bubbleSort01.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}