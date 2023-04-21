package com.example.javaproject2.week1.day5;

public class Point {
    int x;
    int y;
    boolean isSameXY(){
        // x == y?
        return x == y;
    }
    double distanceXY(){
        // x 와 y 사이의 거리?
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
