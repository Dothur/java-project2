package com.example.javaproject2.week2.day4;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemperature = 45;
        int roomTemperature = 22;
        boolean isCheck = waterTemperature < 50 && roomTemperature < 24;
        System.out.println("isCheck = " + isCheck);
    }
}
