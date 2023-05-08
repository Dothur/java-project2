package com.example.javaproject2.week4.day1;

public class User {
    String name;
    String phoneNumber; // 01012345678 --> int 로 하면 0 없어짐
    int age;

    boolean isAdult(){
        return age >= 18;
    }
}
