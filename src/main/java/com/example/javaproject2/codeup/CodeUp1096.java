package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int whiteNum = sc.nextInt();
        int[][] checkerboardArr = new int[20][20];
        for(int i=1; i<20; i++){
            Arrays.fill(checkerboardArr[i], 0);
        }
        for(int i=0; i < whiteNum; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            checkerboardArr[x][y] = 1;
        }
        for(int i=1; i<20; i++){
            for(int j=1; j<20; j++){
                System.out.printf("%d ", checkerboardArr[i][j]);
            }
            System.out.println();
        }
    }
}
