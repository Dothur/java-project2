package com.example.javaproject2.week4.day3;

public abstract class ShapeDrawer2 {
    // abstract 로 피라미드, 역피라미드 등등 추상화
    public abstract String makeALine(int h, int i);

    public void printShape(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.printf("%s", makeALine(height, i));
        }
    }

//    public static void main(String[] args) {
//        RightTriangleDraw rtd = new RightTriangleDraw(); // 생성
//        rtd.printShape(5); // 호출
//    }
}