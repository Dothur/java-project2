package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArray {
    // 메소드로 리팩토링
    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("---------");
    }
    public static void main(String[] args) {
        int[][] intArr = new int[3][3];
        int[] intArr0 = intArr[0]; // 0행 [0, 0, 0] 을 뽑아옴
        intArr0[0] = 1; // [1, 0, 0]

        printArray(intArr);

        intArr[0][1] = 2;
        intArr[0][2] = 3;

        printArray(intArr);
    }
}
