package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User dohun = new User();
        dohun.name = "김도훈";
        dohun.phoneNumber = "010-xxxx-xxxx";
        dohun.age = 25;
        System.out.printf("%s님은 성인입니까? : %s\n", dohun.name, dohun.isAdult());

        User kim = new User();
        kim.name = "kim";
        kim.phoneNumber = "010-xxxx-xxxx";
        kim.age = 17;
        System.out.printf("%s님은 성인입니까? : %s\n", kim.name, kim.isAdult());
    }
}
