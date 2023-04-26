package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRowColumn {
    public static void arrFillRow(int[][] arr, int rowNum){
        for(int i = 0; i < 5; i++){
            arr[rowNum][i] = 1;
        }
    }
    public static void arrFillColumn(int[][] arr, int columnNum){
        for(int i = 0; i < 5; i++){
            arr[i][columnNum] = 2;
        }
    }
    public static void printArray(int[][] arr){
        for(int i=0; i<5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("---------------");
    }
    public static void main(String[] args) {
        int[][] intArr = new int[5][5];
        arrFillRow(intArr, 2);
        arrFillColumn(intArr, 2);
        printArray(intArr);
    }
}
