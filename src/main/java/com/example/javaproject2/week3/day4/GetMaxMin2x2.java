package com.example.javaproject2.week3.day4;

public class GetMaxMin2x2 {
    public static void main(String[] args) {
        int[][] arr = {{3, 5, 20, 31, 45}, {2, 4, 30, 9, 7}};

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] > maxNum) {
                    maxNum = arr[i][j];
                }
                if (arr[i][j] < minNum) {
                    minNum = arr[i][j];
                }
            }

        }
        System.out.println(maxNum);
        System.out.println(minNum);
    }
}
