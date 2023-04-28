package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int callCnt = sc.nextInt();
        int[] randomNumArray = new int[callCnt];
        for (int i = 0; i < callCnt; i++) {
            randomNumArray[i] = sc.nextInt();
        }
        for(int i=0; i<randomNumArray.length / 2; i++){
            int temp = randomNumArray[i]; // temp 에 임시 저장
            randomNumArray[i] = randomNumArray[randomNumArray.length - i - 1]; // 배열의 길이에서 - i 와 -1 을 해준 인덱스 값을 넣음
            randomNumArray[randomNumArray.length - i - 1] = temp; // temp 에 임시 저장한 값을 끝에 저장
        }
        for (int j : randomNumArray) {
            System.out.printf("%d ", j);
        }
    }
}
