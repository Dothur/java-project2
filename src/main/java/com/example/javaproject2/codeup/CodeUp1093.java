package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int callStudent = sc.nextInt();
        int[] studentList = new int[23];
        int[] randomCall = new int[callStudent];
        for (int i = 0; i < callStudent; i++) {
            randomCall[i] = sc.nextInt();
        }
        for (int i = 0; i <= studentList.length; i++) {
            for (int j = 0; j < randomCall.length; j++) {
                if (randomCall[j] == i + 1) {
                    studentList[i]++;
                }
            }
        }
        for (int i : studentList) {
            System.out.printf("%d ", i);
        }
    }
}
