package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1098OOP {
    private int heightX;
    private int widthY;
    private int[][] board;

    public CodeUp1098OOP(int heightX, int widthY) {
        this.heightX = heightX;
        this.widthY = widthY;
        this.board = new int[heightX + 1][widthY + 1];
    }

    public void setBoard(int l, int d, int x, int y) {
        for (int i = 0; i < l; i++) {
            if (d == 0) { // 가로
                board[x - 1][y + i - 1] = 1;
            } else { // 세로
                board[x + i - 1][y - 1] = 1;
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < heightX; i++) {
            for (int j = 0; j < widthY; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CodeUp1098OOP oop = new CodeUp1098OOP(sc.nextInt(), sc.nextInt());
        int stickNum = sc.nextInt();
        for (int i = 0; i < stickNum; i++) {
            oop.setBoard(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        oop.printArr();
    }
}

