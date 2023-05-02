package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 박스 배열 입력받기
        int[][] inputBox = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                inputBox[i][j] = sc.nextInt();
            }
        }
        // 개미의 이동경로
        int x = 1;
        int y = 1;
        while (true) {
            if (inputBox[x][y] == 2) {
                inputBox[x][y] = 9;
                break;
            }
            inputBox[x][y] = 9;
            if (inputBox[x][y + 1] != 1) {
                y++;
            } else if (inputBox[x + 1][y] != 1) {
                x++;
            } else {
                break;
            }
        }
        // 상자 배열 출력
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(inputBox[i][j] + " ");
            }
            System.out.println();
        }
    }
}
