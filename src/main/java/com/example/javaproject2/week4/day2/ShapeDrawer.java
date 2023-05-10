package com.example.javaproject2.week4.day2;

public abstract class ShapeDrawer {

    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i)); // 추상 메소드를 printShape method 로 출력
        }
    }
    public abstract String makeALine(int h, int i); // abstract 로 makeALine 추상 메소드 정의
}
