package com.example.javaproject2.week6.day5.interfaceEx;

public interface Human extends Ani, Shape{
    @Override
    void makeSound();

    @Override
    void run();
}
