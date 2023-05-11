package com.example.javaproject2.week4.day1;

public class User {
    private String name;
    private String password;
    private String phoneNumber;
    private int age;

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // password
    public String getPassword() {
        // 접근제어 로직
        return password;
    }

    public void setPassword(String password) {
        // 본인 확인 로직
        this.password = password;
    }

    // age
    boolean isAdult() {
        return age >= 18;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Constructor
    public User(){

    }
    public User(String name, String password, String phoneNumber, int age) {
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
}