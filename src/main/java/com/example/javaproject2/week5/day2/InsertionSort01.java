package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSort01 {
    // 삽입정렬 바로 옆칸이랑 비교
    // asc  : 오름차순
    // desc : 내림차순
    public int[] sort(int[] arr, boolean isAscending) { // 메소드 오버로딩
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if ((isAscending ? arr[j - 1] - arr[j] : arr[j] - arr[j-1]) > 0) { // 이부분에 따라 오름차순 내림차순이 갈림
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        return sort(arr, true);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};
        InsertionSort01 is01 = new InsertionSort01();
        is01.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
