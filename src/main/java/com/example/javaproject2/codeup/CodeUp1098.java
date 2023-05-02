package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heightX = sc.nextInt();
        int widthY = sc.nextInt();
        int stickN = sc.nextInt();
        int[][] board = new int[heightX + 1][widthY + 1];
        for (int i = 0; i < stickN; i++) {
            int stickLength = sc.nextInt();
            int direction = sc.nextInt(); // 방향 0 = 가로 , 1 = 세로
            int stickX = sc.nextInt(); // height
            int stickY = sc.nextInt(); // width
            for (int j = 0; j < stickLength; j++) {
                if (direction == 0) {
                    board[stickX - 1][stickY + j - 1] = 1;
                } else {
                    board[stickX + j - 1][stickY - 1] = 1;
                }
            }
        }
        // 격자판 출력 for 문
        for (int i = 0; i < heightX; i++) {
            for (int j = 0; j < widthY; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }
    }
}
