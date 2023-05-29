package com.example.javaproject2.week6.day5.interfaceEx;

public class Bird implements Human{
    @Override
    public void makeSound() {
        System.out.println("왈왈");
    }

    @Override
    public void run() {
        System.out.println("shape");
    }
}
