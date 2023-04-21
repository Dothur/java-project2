package com.example.javaproject2.week1.day5;

public class Point {
    int x;
    int y;
    boolean isSameXY(){
        // x == y?
        return x == y;
    }
    double getDistance(Point end){
        // x 와 y 사이의 거리?
        int xL = this.x - end.x;
        int yL = this.y - end.y;

        double sumOfPow = Math.pow(xL, 2) + Math.pow(yL, 2); // 제곱

        return Math.sqrt(sumOfPow); // 루트
    }
}
