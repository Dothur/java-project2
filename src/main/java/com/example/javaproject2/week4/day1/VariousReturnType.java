package com.example.javaproject2.week4.day1;

public class VariousReturnType {
    public boolean isAdult(){
        return true;
    }
    public int plus(){
        return 1+1;
    }
    public User getUser(){
        return new User();
    }
    public void printHello(){  // 리턴값이 없습니다.
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        VariousReturnType vrt = new VariousReturnType();
        boolean isAdult = vrt.isAdult(); // boolean 타입을 리턴
        int plusResult = vrt.plus();
        User user = vrt.getUser(); // User 클래스 type
        vrt.printHello(); // void 는 리턴값이 없음.
    }
}
