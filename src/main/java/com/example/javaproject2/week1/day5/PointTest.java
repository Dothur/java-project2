package com.example.javaproject2.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        // 0,0 점 만들기
        Point p1 = new Point();
        System.out.printf("x:%d, y:%d\n", p1.x, p1.y);
        System.out.printf("xy가 같은가요? : %s\n", p1.isSameXY());

        // 또 다른 점 찍기
        Point p2 = new Point();
        p2.x = 4;
        p2.y = 5;
        System.out.printf("x:%d, y:%d\n", p2.x, p2.y);
        System.out.printf("xy가 같은가요? : %s\n", p2.isSameXY());

        Point p3 = new Point();
        p3.x = 2;
        p3.y = 3;
        System.out.printf("x:%d, y:%d\n", p3.x, p3.y);
        System.out.printf("xy가 같은가요? : %s\n", p3.isSameXY());
        System.out.printf("x와 y 사이의 거리 : %.2f\n", p3.getDistance(p2));
    }
}
