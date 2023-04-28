package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] checkerboardArr = new int[20][20];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                int board = sc.nextInt();
                checkerboardArr[i][j] = board; // 바둑판 입력받기
            }
        }
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = 0; j < 19; j++) { // 가로줄 뒤집기
                if (checkerboardArr[x-1][j] == 0) {
                    checkerboardArr[x-1][j] = 1;
                } else {
                    checkerboardArr[x-1][j] = 0;
                }
            }
            for (int j = 0; j < 19; j++) { // 세로줄 뒤집기
                if (checkerboardArr[j][y-1] == 0) {
                    checkerboardArr[j][y-1] = 1;
                } else {
                    checkerboardArr[j][y-1] = 0;
                }
            }
        }
        for (int i = 0; i < 19; i++) { // 바둑판 현황 출력
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", checkerboardArr[i][j]);
            }
            System.out.println();
        }
    }
}
