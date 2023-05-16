package com.example.javaproject2.week5.day2.addtional.interfaceEx;

public class RightTriangleDrawer implements ShapeDrawer{
    @Override
    public String makeALine(int h, int i) {
        return "*".repeat(i);
    }
}
