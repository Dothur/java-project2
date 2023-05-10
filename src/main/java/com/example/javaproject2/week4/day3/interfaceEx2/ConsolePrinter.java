package com.example.javaproject2.week4.day3.interfaceEx2;

public class ConsolePrinter implements Printer2{

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
