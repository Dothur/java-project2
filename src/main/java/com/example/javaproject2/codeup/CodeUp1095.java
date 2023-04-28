package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int callCnt = sc.nextInt();
        int[] randomNumArray = new int[callCnt];
        for (int i = 0; i < callCnt; i++) {
            randomNumArray[i] = sc.nextInt();
        }
        Arrays.sort(randomNumArray);
        System.out.println(randomNumArray[0]);
    }
}
