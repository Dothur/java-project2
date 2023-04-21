package com.example.javaproject2.week1.day5;

public class SpaceInvader {
    private void moveLeft() { // 왼쪽으로 이동하는 메소드
        int location = 0;
        location += -1; // 변수 사라짐
        System.out.printf("moveLeft: %d\n", location);
    }

    private void moveRight() {// 오른쪽으로 이동하는 메소드
        int location = 0;
        location += 1; // 변수 사라짐
        System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvader si = new SpaceInvader();
        si.moveLeft();
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();
    }
}