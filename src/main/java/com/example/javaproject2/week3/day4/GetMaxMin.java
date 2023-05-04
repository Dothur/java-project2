package com.example.javaproject2.week3.day4;

public class GetMaxMin {
    public static void main(String[] args) {
        int[] arr = {2, 1, 30, 9, 7};

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
            if(arr[i] < minNum){
                minNum = arr[i];
            }
        }
        System.out.println(maxNum);
        System.out.println(minNum);
    }
}
